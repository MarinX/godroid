godroid
=======

Golang 1.4 beta on Android

Thanks for support:
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-GoDroid-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1075)

###QUICK TUTORIAL

1. Download and install NDK -> From go.mobile:

Pick a home for the standalone NDK toolchain and set an environment variable:
	NDK_ROOT=$HOME/android/ndk-toolchain

Configure the NDK toolchain:

	ndk/build/tools/make-standalone-toolchain.sh --platform=android-9 --install-dir=$NDK_ROOT

2. Get the Golang 1.4 beta, go to into src dir and type: 

		CC_FOR_TARGET=$NDK_CC GOOS=android GOARCH=arm GOARM=7 ./make.bash

3. At some point, you should see gcc erros about 'gcc: error: unrecognized command line option -marm'

4. Now, tricky part. Beacuse go dosen't know which toolchain to use for android you must trick him to use gcc from ndk toolchain. 

Put in you profile bash/zsh:

		PATH=/path_to_installed_ndk_toolchain/arm-linux-androideabi/bin/gcc:$PATH

Dont forget to source your profile!!!

5.
Check with command "which gcc". This will point you to your ndk toolchain default ex.

		"/home/marin/android/ndk-toolchain/arm-linux-androideabi/bin/gcc"

6.
Go get:

	go get github.com/MarinX/godroid

install all dependicies and explore the source :)

8.
Folder android_so_lib, contains makefile to build your .so lib (I already included this is AndroidStudio project, so you can check it and run)

9.
You can import the android_studio project and explore/modify/run (support for android 2.3>=).

11.
When you are done, don't forget to uncomment or remove the PATH you set, to use your standard gcc.

10.
@TODO I suggest to install gobind and get familiarize with the tool to generate go-java lib(http://godoc.org/code.google.com/p/go.mobile/cmd/gobind). 
	
    I will write more tutorials when I will have time! This is just a quick demo.

Destination for apk:
                https://www.dropbox.com/s/grm5tyfg0ox7zq1/GoDroid.apk?dl=0

										
