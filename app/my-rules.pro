#-keepclasseswithmembernames class com.example.obfuscationexample.BlankFragment {
#    java.lang.String *;
##    which type to keep
#}
#
#-keep public class * extends android.app.Activity
##requires class only
#
#-keepclassmembers class * implements android.os.Parcelable {
#    public *;
##have to tell abut members too
#}
#
#-keepclasseswithmembers class * {
#public <init>(android.content.Context);
#tell about member
#}