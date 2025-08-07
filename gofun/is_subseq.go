package main

import (
	"bufio"
	"fmt"
	"os"
)

func isSubseq(s string, t string) bool {

	var si int = 0

	if s == "" {
		return true
	}

	for _, v := range t {
		if rune(s[si]) == v {
			si++
		}
		if si >= len(s) {
			return true
		}
	}

	return false

}

type IsSubsequence struct{}

func (e *IsSubsequence) Run() {
	r := bufio.NewReader(os.Stdin)
	s, _ := r.ReadString('\n')
	t, _ := r.ReadString('\n')
	fmt.Println(isSubseq(s, t))
}
