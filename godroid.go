// godroid
package godroid

import (
	"fmt"
	"net/http"
)

func SayGo(txt string) {
	http.ListenAndServe(":8080", nil)
	fmt.Println("Go says ", txt)
}
func ListeAndServe() {
	fmt.Println("Listen and serving on port 8080")
	go http.ListenAndServe(":8080", http.FileServer(http.Dir("/")))
}
