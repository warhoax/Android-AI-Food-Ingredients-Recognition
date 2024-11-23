# Food Allergy Identification using Machine Learning (FAIML)

**FAIML** is an Android application designed to help individuals with food allergies identify harmful ingredients in meals using machine learning. By uploading an image of food, the app predicts its ingredients and alerts users if any of the identified components match their specified allergies. This project utilizes the **Clarifai Food Item Recognition Model** for ingredient identification and was developed in **Kotlin** using **Android Studio**.

---

## 🚀 Features
- **Ingredient Identification**: Analyze food images to determine their ingredients.
- **Allergy Detection**: Alerts users about harmful ingredients based on their allergy preferences.
- **User-Friendly Interface**: Intuitive design with easy navigation and dropdown lists for allergy selection.
- **Cloud Integration**: Uses the Clarifai API for processing images in the cloud.

---

## 🛠️ Technologies Used
- **Language**: Kotlin
- **Framework**: Android Studio (4.0 or later)
- **AI Model**: Clarifai Food Item Recognition Model
- **Tools**: Gradle (6.5), Java JDK (11.0.9)
- **API Level**: Android API 29 (Android 9 or later)

---

## 📋 Prerequisites
- **Android Studio Version**: 4.0 or greater
- **Java JDK**: 11.0.9
- **Android Gradle Plugin**: 4.1.2
- **Gradle**: 6.5
- **Compile SDK**: 29
- **Build Tools Version**: 29.0.2
- **Android Emulator**: Android 9 or later

---

## 🖥️ Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/FAIML.git

2. Open the project in Android Studio.
3. Configure the Clarifai API Key:
   - Navigate to `app/src/main/res/values/strings.xml`.
   - Add your Clarifai API key in the placeholder:
     ```xml
     <string name="clarifai_api_key">YOUR_API_KEY</string>
     ```


4. Sync the Gradle files.
5. Run the project on an emulator or physical device.

## 📚 Project Overview
This project was developed as part of a **Final Year Project (FYP)** for a Bachelor's in 2021. The application addresses the challenge of identifying allergenic ingredients in food, offering a practical solution for individuals with dietary restrictions.

### Key Modules
1. **Image Upload Module**: Upload an image from your phone for analysis.
2. **Ingredients List Module**: Select allergenic ingredients from a dropdown list.
3. **Prediction Module**: Get ingredient predictions and allergy alerts.

---

## 🛡️ Limitations
- Requires an active internet connection.
- Accuracy depends on image quality.
- Limited to predicting ingredients; does not provide nutritional information.

---

## 🎯 Future Enhancements
- Include food origin and nutritional information.
- Improve accuracy with larger datasets and better models.
- Offline functionality for ingredient detection.

---

## 📜 License
This project is licensed under the **Educational Use License**. It may be used for educational purposes, including learning, teaching, academic research, and personal study. **Commercial use is strictly prohibited.**

See the [LICENSE](LICENSE) file for more details.

---

## 📝 Acknowledgments
- **Clarifai** for providing the Food Item Recognition Model.

