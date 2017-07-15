godroid
=======

Golang 1.4 beta on Android

currently only working on linux (use a vm if are on macos)


Thanks for support:
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-GoDroid-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1075)

### Discounted! As from official go 1.4, use native functions.
### QUICK TUTORIAL

1. Download and install NDK -> From go.mobile:

Pick a home for the standalone NDK toolchain and set an environment variable:
	NDK_ROOT=$HOME/android/ndk-toolchain

Configure the NDK toolchain:

	ndk/build/tools/make-standalone-toolchain.sh --platform=android-9 --install-dir=$NDK_ROOT

2. Get the Golang 1.4 beta, go to into src dir and type: 

		CC_FOR_TARGET=$NDK_CC GOOS=android GOARCH=arm GOARM=7 ./make.bash

3. At some point, you should see gcc erros about 'gcc: error: unrecognized command line option -marm'

4. Go get:

	go get github.com/MarinX/godroid

install all dependicies and explore the source :)

5. Folder android_so_lib, contains makefile to build your .so lib (I already included this is AndroidStudio project, so you can check it and run)

6.You can import the android_studio project and explore/modify/run (support for android 2.3>=).

7. When you are done, don't forget to uncomment or remove the PATH you set, to use your standard gcc.

### Discounted! As from official go 1.4, use native functions.
										
