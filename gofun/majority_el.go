package main

import (
	"fmt"
	"slices"
)

func majorityElement(nums []int) int {

	slices.Sort(nums)

	if len(nums) < 3 {

		if len(nums) == 2 {
			if nums[0] == nums[1] {
				return nums[0]
			} else {
				return -1
			}
		}
		if nums[0] == nums[len(nums)/2] {
			return nums[0]
		} else if nums[1] == nums[len(nums)/2] {
			return nums[1]
		}

	}
	desc := nums[:]
	slices.SortFunc(desc, func(a, b int) int {
		if a > b {
			return -1
		} else if b > a {
			return 1
		} else {
			return 0
		}
	})
	fmt.Println(desc)
	p1s, _ := slices.BinarySearch(nums, nums[(len(nums)/2)-1])
	p2s, _ := slices.BinarySearch(nums, nums[len(nums)/2])
	p3s, _ := slices.BinarySearch(nums, nums[(len(nums)/2)+1])

	p1e, _ := slices.BinarySearch(desc, desc[(len(desc)/2)-1])
	p2e, _ := slices.BinarySearch(desc, desc[len(desc)/2])
	p3e, _ := slices.BinarySearch(desc, desc[(len(desc)/2)+1])

	mf := slices.Max([]int{p1e - p1s, p2e - p2s, p3e - p3s})

	if p1e-p1s == mf {
		return nums[(len(nums)/2)-1]
	} else if p2e-p2s == mf {

		return nums[(len(nums) / 2)]
	} else if p3e-p3s == mf {

		return nums[(len(nums)/2)+1]
	}

	return -1
}

type MajorityElement struct{}

func (e *MajorityElement) Run() {

	fmt.Println(majorityElement([]int{1, 2, 3}))
}
