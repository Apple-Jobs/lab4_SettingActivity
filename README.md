# lab4_SettingActivity
实现设置Activity

## 实验内容：
Android实验四_实现设置Activity实验，本代码创建了Android工程按要求使用PrefereceFragment实现设置页面。

## 关键代码：

```
<?xml version="1.0" encoding="utf-8"?>
<PreferenceScreen xmlns:android="http://schemas.android.com/apk/res/android">
    <PreferenceCategory
        android:title="@string/pref_inline"
        android:key="pref_key_inline_settings"
        >
        <CheckBoxPreference
            android:key="pref_checkbox"
            android:title="@string/pref_checkbox"
            android:summary="@string/pref_checkbox_summ"
            android:defaultValue="false" />
    </PreferenceCategory>
    <PreferenceCategory
        android:title="@string/pref_dialog"
        android:key="pref_key_dialog">
        <EditTextPreference
            android:key="pref_edittext"
            android:title="@string/pref_edittext"
            android:summary="@string/pref_edittext_summ"
            android:dialogTitle="Enter your favorite animal"
            />
        <ListPreference
            android:title="@string/pref_list"
            android:summary="@string/pref_list_summ"
            android:dialogTitle="Choose one"
            android:entries="@array/pref_list_values"
            android:entryValues="@array/pref_list_values"
            />
    </PreferenceCategory>

    <PreferenceCategory
        android:title="@string/pref_launch"
        android:key="pref_key_launch">
        <PreferenceScreen
            android:title="@string/pref_screen"
            android:summary="@string/pref_screen_summ">
            <CheckBoxPreference
                android:title="@string/toggle"
                android:summary="@string/toggle_summ"
                android:key="@string/toggle_key"/>
        </PreferenceScreen>
        <PreferenceScreen
            android:title="@string/pref_intent"
            android:summary="@string/pref_intent_summ">
        <intent
            android:action="android.intent.action.VIEW"
            android:data="https://github.com/Apple-Jobs"/>
        </PreferenceScreen>
    </PreferenceCategory>

    <PreferenceCategory
        android:title="@string/pref_attribute"
        android:key="pref_key_attribute">
        <CheckBoxPreference
            android:title="@string/pref_parent_checkbox"
            android:summary="@string/pref_parent_checkbox_summ"
            android:key="pref_parent_value"/>
        <CheckBoxPreference
            android:dependency="pref_parent_value"
            android:title="@string/pref_child_checkbox"
            android:summary="@string/pref_child_checkbox_summ"/>
    </PreferenceCategory>
</PreferenceScreen>
```
## 实验结果：
![Image text](https://github.com/Apple-Jobs/img-folder/blob/master/preference41.png)<br>
![Image text](https://github.com/Apple-Jobs/img-folder/blob/master/preference42.png)<br>
![Image text](https://github.com/Apple-Jobs/img-folder/blob/master/preference43.png)<br>
![Image text](https://github.com/Apple-Jobs/img-folder/blob/master/preference44.png)<br>
![Image text](https://github.com/Apple-Jobs/img-folder/blob/master/preference45.png)<br>
![Image text](https://github.com/Apple-Jobs/img-folder/blob/master/preference46.png)<br>
![Image text](https://github.com/Apple-Jobs/img-folder/blob/master/preference47.png)<br>

## 问题：
1.开始时因为导错包代码出现错误。已解决。<br>
2.代码修改后，运行结果不改变。通过重建项目解决。
