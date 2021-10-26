<h3 align="center">Mandh Android Intro View Screen Helper</h3>

<div align="center">

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center"> This project created for helping management of intro screens in Mandh Android applications.
    <br> 
</p>

## 📝 Table of Contents

- [About](#about)
- [Usage](#usage)
- [Authors](#authors)

## 🧐 About <a name = "about"></a>

IntroView is making easy for handle intro screens in our applications. We expect to prevent confusing and gaining time for creation intro view in every applications.

## 🎈 Usage <a name="usage"></a>

Add Jitpack to proect build.gradle
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
        ...
    }
}
```

Add implementation to app/build.gradle
```
dependencies {
    ...
    implementation 'com.github.hunkar:mandh-android-introview:1.0.1'
    ...
}
```

As a first, you put your image resources of intro views to drawable folder. And later you can create intro view.
``` Java
    ArrayList<IntroData> introData = new ArrayList<>();                                         //Define ArrayList of IntroData. Intros will show by array order.
    
    introData.add(new IntroData("Title-1", "Description-1",                                     //Title, description, image resource
                R.drawable.intro_first));                       
    introData.add(new IntroData("Title-2", "Description-2",
                R.drawable.intro_second, R.drawable.background_image, Color.BLACK,              //Title, description, image resource, title color,
                Color.BLACK, Color.WHITE, R.font.opensans_regular, R.font.opensans_regular));   //description color, background color, title font, description font
                
                
    Intro introView = new Intro(MainActivity.this, introData);                                  //Create Intro
    
    
    intro.checkAndShowIntro();                                                                  //Checks if intro haven't opened before and show.
    intro.showIntro();                                                                          //Shows intro view without any condition when you call this method.
```

## ✍️ Authors <a name = "authors"></a>

- [Mandh Solutions](http://www.mandhsolutions.com/) - Idea & Initial work