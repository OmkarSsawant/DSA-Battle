package main

type Runner interface {
	Run()
}

func main() {
	var r Runner = &MajorityElement{}
	r.Run()
}
