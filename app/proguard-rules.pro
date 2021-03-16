# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

#-keepclasseswithmembernames
# kept class but not fields

#-keepclasseswithmembers
# keep fields

#-keepclassmembers class com.example.obfuscationexample.Utils
# does nothing on general class

#-keep class com.example.obfuscationexample.Utils
# keeps only data that is used

#-include my-rules.pro
# to include another proguard


# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile


#-keepclasseswithmembernames class com.example.obfuscationexample.MainActivity {
#     private *;
# you can declare which access modifier to keep
#}


#
#-keepattributes class com.example.obfuscationexample.MainActivity {
#    * ;
#}

#-flattenpackagehierarchy
# creates multiple folders

#-repackageclasses src
# add all the generated classes in src folder
# only accepts src folder

#-keepnames class com.example.obfuscationexample.Utils
# keeps only constructor

#-keeppackagenames com.example.obfuscationexample
# keep files in same package

#-keepparameternames com.example.obfuscationexample

#<methods>
# for methods
