package main

import (
	"code.google.com/p/go.mobile/app"

	_ "code.google.com/p/go.mobile/bind/java"
	_ "github.com/MarinX/godroid/go_godroid"
)

func main() {
	app.Run(app.Callbacks{})
}
