package com.wang.cleancode.preferexceptions;
/*
 * Exception is better than ErrorCode, because any change on this Enum will
 * cause re-compile and re-deploy. Developer will try to use existing code.
 */
public enum ErrorCode {
	OK,
	INVALID,
	NO_SUCH,
	LOCKED,
	OUT_OF_RESOURCES,
	WAITING_FOR_EVENT
}
