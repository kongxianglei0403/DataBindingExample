# DataBindingExample
databinding的简单应用<br>
在工程的build.gradle文件下添加<br>
```java
    android{
      dataBinding {
        enabled true
      }
       ...
    }
```

## 绑定model使用
* 同类的两个对象
  * 布局文件
  ```java
  <layout><!--布局以layout作为根布局-->
      <data>
        <import type="com.kxl.atu.databindingexample.bean.User"/>
        <variable
            name="user1"
            type="User"/>
       <variable
            name="user2"
            type="User"/>
      </data>
      <!--我们需要展示的布局-->
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context="com.kxl.atu.databindingexample.databinding.ActivityAutoUpdateBinding;">

        <Button
            android:id="@+id/main_btn7"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="@{user1.firstName}" />

        <Button
            android:id="@+id/main_btn8"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="@{user2.firstName}" />

    </LinearLayout>
  </layout>
  ```
  * AutoUpdateActivity类
  ```java
  public class AutoUpdateActivity extends BaseActivity {

      //ActivityAutoUpdateBinding对象是根据activity_auto_update布局文件的名字自动生成的
      private ActivityAutoUpdateBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auto_update);
        User user1 = new User("相同类", "不同对象1", 1);
        binding.setUser(user1);
        User user2 = new User("相同类", "不同对象2", 2);
        binding.setUser(user2);
    }
  }
  ```



