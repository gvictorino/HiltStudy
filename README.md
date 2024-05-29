# Hilt Study App

Welcome to Hilt Android App! This app provides information about family-friendly cat breeds, including their characteristics, origin, and images.

## Getting Started

To get started with the Hilt Android App, follow these steps:

1. **Clone the Repository**: Clone this repository to your local machine using Git.

   ```bash
   git clone https://github.com/gvictorino/HiltStudy.git

2. **Register for an API Key**: Visit [API Ninjas](https://api-ninjas.com/api/cats) and create an account to receive an API key. You'll need this API key to fetch cat data in the app.
3. **Add API Key**: Once you have your API key, add it to the project. Locate the RetrofitProviderModule file in the DI directory of the project and add your API key as follows:
  ```bash
  @Provides
    @Singleton
    fun provideApiKey(): String {
        return "YOUR_API_KEY"
    }
```

 4. **Build and Run**: Build and run the app on an emulator or a physical device. Make sure you have the necessary dependencies and Android Studio set up.

## Features
 
 View a list of family-friendly cat breeds with their characteristics.

## Contributing

Contributions are welcome! If you find any bugs or have suggestions for new features, feel free to open an issue or submit a pull request.
