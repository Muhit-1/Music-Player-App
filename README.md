# 🎵 Music Player App

This is a simple yet powerful **Android Music Player App** built using **Kotlin** and **Firebase**. The app allows users to browse music by genre and sections like *Top Music* and *Most Played*, stream songs directly via **JukeHost** links, and enjoy playback using **ExoPlayer**.

Song metadata and images are hosted using **Firebase Firestore** and **imgbb.com** respectively. The app also features **Firebase Authentication** for login and signup functionality.

---

## 🚀 Features

- 🎧 Play music via **ExoPlayer**
- 🔥 Sections: *Top Music*, *Most Played*, etc.
- 🎵 Filter music by **Genre**
- 🔐 User Authentication using **Firebase**
- 🌐 Audio streaming via **JukeHost**
- 🖼️ Cover images from **imgbb.com**
- 📱 Simple and clean UI

---

## 🛠️ Tech Stack

- **Kotlin**
- **Firebase Firestore**
- **Firebase Authentication**
- **ExoPlayer**
- **JukeHost** (for audio)
- **imgbb.com** (for cover images)
- **Android Studio**

---

## 📸 Screenshots

> _You can replace the image links below with actual hosted URLs or embed local paths._

| Home | Genre View | Player |
|------|------------|--------|
| ![home](https://i.ibb.co/Vcxxrrx4/Whats-App-Image-2025-06-29-at-22-36-33-1092d730.jpg) | ![genre](https://i.ibb.co/hrBWvJ6/Whats-App-Image-2025-06-29-at-22-47-16-7911797c.jpg) | ![player](https://i.ibb.co/RpgMsQfR/Whats-App-Image-2025-06-29-at-22-36-33-54321f79.jpg) |

---

## 📦 Installation Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Muhit-1/Music-Player-App.git
2. **Open the project in Android Studio.**
3. **Connect Firebase:**
   - Go to Firebase Console
   - Create a new Firebase project.
   - Add Android app and register your package name.
   - Download google-services.json and place it in your app/ directory.
   - Enable Firestore and Authentication (Email/Password).
4. **Dependencies:**
   - Ensure your *build.gradle* files have the required Firebase and ExoPlayer dependencies.
5. **Run the App:**
   - Connect your Android device or emulator.
   - Click Run in Android Studio.
  

## 🧪 Usage

1. **Sign up** or **log in** using Firebase Authentication.
2. **Browse music** by genre or section (e.g., *Top Music*, *Most Played*).
3. **Tap a song** to play it using the built-in **ExoPlayer**.

### 🎵 To upload a new song:

1. **Upload** your audio file to [JukeHost](https://jukehost.co.uk/).
2. **Copy** the direct audio URL provided by JukeHost.
3. **Go to Firebase Firestore** and add a new song entry under the `songs` collection with the following fields:
   - `title`: Song title  
   - `artist`: Artist name  
   - `url`: Direct audio URL from JukeHost  
   - `coverUrl`: Link to cover image (you can host it on [imgbb.com](https://imgbb.com/))  
   - `count`: Set to `0` (used to track play count)  
   - `id`: A unique ID for the song
  

## 👤 Author

### [Muhit Rahman](https://github.com/muhit-1)


## ⚠️ Known Issues

- ⏭️ Next song button is not yet implemented.

---

## 📄 License

This project currently does not use a license.  
You can choose one at [choosealicense.com](https://choosealicense.com/) if needed.

---

## 💡 Future Work

- Add "Next" and "Previous" playback controls
- User playlist creation
- Music search functionality
- In-app song upload with audio hosting



