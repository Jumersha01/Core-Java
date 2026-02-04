package com.junaid.stream_api;

import java.util.Arrays;

public class StreamDemo05 {
	void main() {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		Arrays.stream(arr).map(ele->ele).forEach(ele->IO.println(Arrays.toString(ele)));
		int arr2[]	={10,11,12};
		
		Arrays.stream(arr).flatMapToInt(list->Arrays.stream(list)).forEach(IO::println);
		Arrays.stream(arr2).map(ele->ele).forEach(IO::println);
	}

}
