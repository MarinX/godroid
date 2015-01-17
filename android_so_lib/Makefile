all:
	CC=${NDK_ROOT}/arm-linux-androideabi/bin/gcc CGO_ENABLED=1 GOOS=android GOARCH=arm go build -o libgojni.so -ldflags="-shared"
