### -To add applixiar ads to your android app just follow the folowing 3 steps :
1-copy/paste applixir-release.aar file in to your project libraries
### path: projectfile->app>libs


2-add the library implemetation in to your gradle
-in the build.gradle (module:app) in the dependencies block paste the line
### implementation files('libs/applixir-release.aar')

3-in the activity that you want to show add :launch the applixir ad launcher 

- inside the activity class initialize the ads launcher:

### private var adsLauncher =
###      registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
###         val isRewarded = checkRewardedAd(result)
### }

     
-whenever you want to launch the applixir ad:
###    adsLauncher.launch(startApplixir(this@MainActivity,
###             url = "https://js.applixirads.com/Android-test-1.html" ))

