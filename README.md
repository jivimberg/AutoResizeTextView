AutoResizeTextView
==================

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.jivimberg/autoresizetextview/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.jivimberg/autoresizetextview/)

Text view that auto adjusts text size to fit within the view.
This library is heavily based on [Chase's](http://stackoverflow.com/users/210130/chase) [answer](http://stackoverflow.com/a/5535672) to this [Stack Overflow question](http://stackoverflow.com/questions/5033012/auto-scale-textview-text-to-fit-within-bounds). It works with custom fonts.

##Usage
```
dependencies {
    compile 'com.github.jivimberg:autoresizetextview:0.0.2'
}
```

Use the AutoResizeTextView in your XML:
```
<com.github.jivimberg.library.AutoResizeTextView
        android:text="@string/super_long_text"
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:textSize="86sp"/>
```

##License
                    DO WHAT YOU WANT TO PUBLIC LICENSE 
                        Version 2, December 2004 
    
     Copyright (C) 2004 Sam Hocevar <sam@hocevar.net> 
    
     Everyone is permitted to copy and distribute verbatim or modified 
     copies of this license document, and changing it is allowed as long 
     as the name is changed. 
  
              DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
     TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION 
  
    0. You just DO WHAT THE FUCK YOU WANT TO.
