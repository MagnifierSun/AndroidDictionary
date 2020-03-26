[AccessibilityButtonController](../android/accessibilityservice/AccessibilityButtonController.java)

```
系统界面中可用服务按钮控制器。不知道在哪
```

[AccessibilityService](../android/accessibilityservice/AccessibilityService.java)

```
辅助服务，用于辅助残障人士使用手机。由系统管理生命周期，接收特定的系统事件，只有当用户手动去设置里打开辅助服务的时候才会有用。
```

[AccessibilityServiceInfo](../android/accessibilityservice/AccessibilityServiceInfo.java)

```
辅助服务事件的封装
```

[AbstractAccountAuthenticator](../android/accounts/AbstractAccountAuthenticator.java)

[Account](../android/accounts/Account.java)

[AccountAuthenticatorActivity](../android/accounts/AccountAuthenticatorActivity.java)

[AccountAuthenticatorResponse](../android/accounts/AccountAuthenticatorResponse.java)

[AccountManager](../android/accounts/AccountManager.java)

[AccountManagerCallback](../android/accounts/AccountManagerCallback.java)

[AccountManagerFuture](../android/accounts/AccountManagerFuture.java)

[AccountsException](../android/accounts/AccountsException.java)

[AuthenticatorDescription](../android/accounts/AuthenticatorDescription.java)

[AuthenticatorException](../android/accounts/AuthenticatorException.java)

```
以上都是Account相关的类，忽略。
```

[Animator](../android/animation/Animator.java)

```
动画的父类，提供了start,pause,end等生命周期及其回调方法的声明，抽象类。
```

[AnimatorInflater](../android/animation/AnimatorInflater.java)

```
顾名思义，由xml配置文件inflate出动画Animator
```

[AnimatorListenerAdapter](../android/animation/AnimatorListenerAdapter.java)

```
动画监听器，未提供具体实现。
```

[AnimatorSet](../android/animation/AnimatorSet.java)

```
动画的集合。可以让多个动画通过同时播放、顺序播放以及延迟播放。
```

[ArgbEvaluator](../android/animation/ArgbEvaluator.java)

```
颜色生成器。由一个初始颜色，一个终点颜色，一个float的百分比来生成一个颜色，常用于颜色动画中渐变颜色的生成。
```

[ActionBar](../android/app/ActionBar.java)

```
应用标题栏、状态栏。在5.0以上用toolbar作为典型代表。
```

[Activity](../android/app/Activity.java)

```
一般来说，是应用内供用户交互的窗口，具备多个生命周期，一般来说，在oncreate中完成设置初始化，在OnDestory当中注销使用到的资源文件。在onstart和onstop生命周期之间保持可见性，在onresume和onpause之间保持可交互。可以在onpause回调中提交用户的数据。注意，Activity是用栈ADT的方式进行管理的。
```

[ActivityGroup](../android/app/ActivityGroup.java)

```
已废弃
```

[ActivityManager](../android/app/ActivityManager.java)

```
一般来说，用于test和debug，获取一些应用的信息。
```

[ActivityOptions](../android/app/ActivityOptions.java)

```
启动Activity时传递的配置参数。可以用于生成很多Activity转场动画。
```

[AlarmManager](../android/app/AlarmManager.java)

```
系统定时服务，定一个时间，系统发出唤醒的广播，用户的广播接收器接收到消息，即使在应用未运行的时候，也可以执行任务。但要注意的是，在onReceive中，return 之前是可以保证CPU一直是wake up 的，但是如果其实执行了异步的任务，那么很可能手机会陷入睡眠，比如启动一个service，要用另外的wake up 保证service启动之前手机不会陷入休眠。
```

[AlertDialog](../android/app/AlertDialog.java)

```
弹出式对话框，会有一个、两个或者三个按钮，这个没法改变，但是弹窗content可以自定义视图，也可以通过setMessage方法直接设置内容
```

[AliasActivity](../android/app/AliasActivity.java)

```
为某个Activity在桌面创建一个快捷入口。
```

[AppComponentFactory](../android/app/AppComponentFactory.java)

```
Interface used to control the instantiation of manifest elements.
only intended to provide a hook for instantiation.
This can be used to perform things such as dependency injection or class loader changes to these classes.
```

[Application](../android/app/Application.java)

```
用于维护应用全局的变量。于应用进程创建后，优先其他任何类初始化。
```

[ApplicationErrorReport](../android/app/ApplicationErrorReport.java)

```
描述应用错误。分别有以下几种：1.应用未初始化2.应用崩溃3.应用ANR4.应用耗电过高5.应用未回收不用的service
```

[AppOpsManager](../android/app/AppOpsManager.java)

```
/**
 * API for interacting with "application operation" tracking.
 *
 * <p>This API is not generally intended for third party application developers; most
 * features are only available to system applications.
 */
```

[AssistContent](../android/app/assist/AssistContent.java)

[AssistStructure](../android/app/assist/AssistStructure.java)

```
google assist ,忽略。
```

[AuthenticationRequiredException](../android/app/AuthenticationRequiredException.java)

```
SecurityException 的一种
```

[AutomaticZenRule](../android/app/AutomaticZenRule.java)

```
Do not Disturb Mode,免打扰模式。参考三星手机的免打扰效果。
```

[AppWidgetHost](../android/appwidget/AppWidgetHost.java)

[AppWidgetHostView](../android/appwidget/AppWidgetHostView.java)

[AppWidgetManager](../android/appwidget/AppWidgetManager.java)

[AppWidgetProvider](../android/appwidget/AppWidgetProvider.java)

[AppWidgetProviderInfo](../android/appwidget/AppWidgetProviderInfo.java)

[AdvertiseCallback](../android/bluetooth/le/AdvertiseCallback.java)

[AdvertiseData](../android/bluetooth/le/AdvertiseData.java)

[AdvertiseSettings](../android/bluetooth/le/AdvertiseSettings.java)

[AdvertisingSet](../android/bluetooth/le/AdvertisingSet.java)

[AdvertisingSetCallback](../android/bluetooth/le/AdvertisingSetCallback.java)

[AdvertisingSetParameters](../android/bluetooth/le/AdvertisingSetParameters.java)

[AssociationRequest](../android/companion/AssociationRequest.java)

[AbstractThreadedSyncAdapter](../android/content/AbstractThreadedSyncAdapter.java)

[ActivityNotFoundException](../android/content/ActivityNotFoundException.java)

[AsyncQueryHandler](../android/content/AsyncQueryHandler.java)

[AsyncTaskLoader](../android/content/AsyncTaskLoader.java)

[ActivityInfo](../android/content/pm/ActivityInfo.java)

[ApplicationInfo](../android/content/pm/ApplicationInfo.java)

[AssetFileDescriptor](../android/content/res/AssetFileDescriptor.java)

[AssetManager](../android/content/res/AssetManager.java)

[AbstractCursor](../android/database/AbstractCursor.java)

[AbstractWindowedCursor](../android/database/AbstractWindowedCursor.java)

[AdaptiveIconDrawable](../android/graphics/drawable/AdaptiveIconDrawable.java)

[Animatable](../android/graphics/drawable/Animatable.java)

[Animatable2](../android/graphics/drawable/Animatable2.java)

[AnimatedImageDrawable](../android/graphics/drawable/AnimatedImageDrawable.java)

[AnimatedStateListDrawable](../android/graphics/drawable/AnimatedStateListDrawable.java)

[AnimatedVectorDrawable](../android/graphics/drawable/AnimatedVectorDrawable.java)

[AnimationDrawable](../android/graphics/drawable/AnimationDrawable.java)

[ArcShape](../android/graphics/drawable/shapes/ArcShape.java)

[AlphabeticIndex](../android/icu/text/AlphabeticIndex.java)

[AbstractInputMethodService](../android/inputmethodservice/AbstractInputMethodService.java)

[Address](../android/location/Address.java)

[AsyncPlayer](../android/media/AsyncPlayer.java)

[AudioAttributes](../android/media/AudioAttributes.java)

[AudioDeviceCallback](../android/media/AudioDeviceCallback.java)

[AudioDeviceInfo](../android/media/AudioDeviceInfo.java)

[AudioFocusRequest](../android/media/AudioFocusRequest.java)

[AudioFormat](../android/media/AudioFormat.java)

[AcousticEchoCanceler](../android/media/audiofx/AcousticEchoCanceler.java)

[AudioEffect](../android/media/audiofx/AudioEffect.java)

[AutomaticGainControl](../android/media/audiofx/AutomaticGainControl.java)

[AudioManager](../android/media/AudioManager.java)

[AudioPlaybackConfiguration](../android/media/AudioPlaybackConfiguration.java)

[AudioPresentation](../android/media/AudioPresentation.java)

[AudioRecord](../android/media/AudioRecord.java)

[AudioRecordingConfiguration](../android/media/AudioRecordingConfiguration.java)

[AudioRouting](../android/media/AudioRouting.java)

[AudioTimestamp](../android/media/AudioTimestamp.java)

[AudioTrack](../android/media/AudioTrack.java)

[AudioCodec](../android/net/rtp/AudioCodec.java)

[AudioGroup](../android/net/rtp/AudioGroup.java)

[AudioStream](../android/net/rtp/AudioStream.java)

[AttachCallback](../android/net/wifi/aware/AttachCallback.java)

[AsyncTask](../android/os/AsyncTask.java)

[AlarmClock](../android/provider/AlarmClock.java)

[Allocation](../android/renderscript/Allocation.java)

[AllocationAdapter](../android/renderscript/AllocationAdapter.java)

[AttestedKeyPair](../android/security/AttestedKeyPair.java)

[AutofillService](../android/service/autofill/AutofillService.java)

[AlwaysOnHotwordDetector](../android/service/voice/AlwaysOnHotwordDetector.java)

[AccessNetworkConstants](../android/telephony/AccessNetworkConstants.java)

[ApnSetting](../android/telephony/data/ApnSetting.java)

[AlteredCharSequence](../android/text/AlteredCharSequence.java)

[AndroidCharacter](../android/text/AndroidCharacter.java)

[Annotation](../android/text/Annotation.java)

[AutoText](../android/text/AutoText.java)

[ArrowKeyMovementMethod](../android/text/method/ArrowKeyMovementMethod.java)

[AbsoluteSizeSpan](../android/text/style/AbsoluteSizeSpan.java)

[AlignmentSpan](../android/text/style/AlignmentSpan.java)

[ArcMotion](../android/transition/ArcMotion.java)

[AutoTransition](../android/transition/AutoTransition.java)

[AndroidException](../android/util/AndroidException.java)

[AndroidRuntimeException](../android/util/AndroidRuntimeException.java)

[ArrayMap](../android/util/ArrayMap.java)

[ArraySet](../android/util/ArraySet.java)

[AtomicFile](../android/util/AtomicFile.java)

[AttributeSet](../android/util/AttributeSet.java)

[AbsSavedState](../android/view/AbsSavedState.java)

[AccessibilityEvent](../android/view/accessibility/AccessibilityEvent.java)

[AccessibilityEventSource](../android/view/accessibility/AccessibilityEventSource.java)

[AccessibilityManager](../android/view/accessibility/AccessibilityManager.java)

[AccessibilityNodeInfo](../android/view/accessibility/AccessibilityNodeInfo.java)

[AccessibilityNodeProvider](../android/view/accessibility/AccessibilityNodeProvider.java)

[AccessibilityRecord](../android/view/accessibility/AccessibilityRecord.java)

[AccessibilityRequestPreparer](../android/view/accessibility/AccessibilityRequestPreparer.java)

[AccessibilityWindowInfo](../android/view/accessibility/AccessibilityWindowInfo.java)

[ActionMode](../android/view/ActionMode.java)

[ActionProvider](../android/view/ActionProvider.java)

[AccelerateDecelerateInterpolator](../android/view/animation/AccelerateDecelerateInterpolator.java)

[AccelerateInterpolator](../android/view/animation/AccelerateInterpolator.java)

[AlphaAnimation](../android/view/animation/AlphaAnimation.java)

[Animation](../android/view/animation/Animation.java)

[AnimationSet](../android/view/animation/AnimationSet.java)

[AnimationUtils](../android/view/animation/AnimationUtils.java)

[AnticipateInterpolator](../android/view/animation/AnticipateInterpolator.java)

[AnticipateOvershootInterpolator](../android/view/animation/AnticipateOvershootInterpolator.java)

[AutofillId](../android/view/autofill/AutofillId.java)

[AutofillManager](../android/view/autofill/AutofillManager.java)

[AutofillValue](../android/view/autofill/AutofillValue.java)

[AbsListView](../android/widget/AbsListView.java)

[AbsoluteLayout](../android/widget/AbsoluteLayout.java)

[AbsSeekBar](../android/widget/AbsSeekBar.java)

[AbsSpinner](../android/widget/AbsSpinner.java)

[ActionMenuView](../android/widget/ActionMenuView.java)

[Adapter](../android/widget/Adapter.java)

[AdapterView](../android/widget/AdapterView.java)

[AdapterViewAnimator](../android/widget/AdapterViewAnimator.java)

[AdapterViewFlipper](../android/widget/AdapterViewFlipper.java)

[Advanceable](../android/widget/Advanceable.java)

[AlphabetIndexer](../android/widget/AlphabetIndexer.java)

[AnalogClock](../android/widget/AnalogClock.java)

[ArrayAdapter](../android/widget/ArrayAdapter.java)

[AutoCompleteTextView](../android/widget/AutoCompleteTextView.java)

