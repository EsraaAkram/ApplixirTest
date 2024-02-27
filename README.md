### To add Applixir ads to your Android app, follow these 3 steps:

1. Copy/paste `applixir-release.aar` file into your project's libraries.
   > **Path:** `projectfolder->app>libs`

2. Add the library implementation into your Gradle:
   - In the `build.gradle` (module:app) file, in the `dependencies` block, paste the following line:
     > `implementation files('libs/applixir-release.aar')`

3. In the activity where you want to show the ad, add the Applixir ad launcher:
   - Inside the activity class, initialize the ads launcher:
     ```kotlin
     private var adsLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
         val isRewarded = checkRewardedAd(result)
     }
     ```
   > **Whenever you want to launch the Applixir ad:**
   ```kotlin
   adsLauncher.launch(startApplixir(this@MainActivity,
         url = "https://js.applixirads.com/Android-test-1.html"))
