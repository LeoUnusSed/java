package org.crazyit.boot.c2;

import org.springframework.stereotype.Service;

@Service
public class RemoteService {

	public String call() {
		return "hello";
	}
}
