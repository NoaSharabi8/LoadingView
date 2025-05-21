# ⏳ LoadingView Library

## 🚀 Overview
**LoadingView** is a simple and flexible Android library that provides a customizable **loading button view**.  
It allows developers to trigger a loading animation on button clicks, providing visual feedback to users during background operations like network requests or data processing.

With this library you can easily configure the appearance and behavior of the button either via **XML layout files** or programmatically in your **Activity or Fragment**.

<p align="center">
  <img src="https://github.com/user-attachments/assets/99c9eb1d-811b-4f63-b292-61ca019b6443" width="350">
  <img src="https://github.com/user-attachments/assets/9f83b5df-6ef1-4a66-88ee-ec98960ff571" width="350">
</p> 

---

## 📦 Installation
To use this library, Add the following to your `build.gradle` file:

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.NoaSharabi8:LoadingView:1.0.2'
}
```

---

## 🚀 Getting Started

### 🧱 Step 1: Add the `LoadingButton` to your XML

```xml
<dev.noash.loadingview.LoadingButton
    android:id="@+id/btn_loading"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:lb_src="@drawable/img_profile"/>
```

### 🧠 Step 2: Control the Button Programmatically

```java
LoadingButton button = findViewById(R.id.btn_loading);

// Set image in button
button.setImageResource(R.drawable.img_profile1);

// Start loading animation
button.showLoading();

// Stop loading animation and return to original text
button.hideLoading();
```

---

## 🤝 Contributing
 Feel free to submit pull requests to help improve the library. Feedback is always welcome!

---

📌 *Maintained by:* Noa Sharabi
