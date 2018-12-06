package com.unimitra.exception;

import org.springframework.http.HttpStatus;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorCodes {

	public static final String USER_HAS_NO_ACCESS = "UM1001 " + HttpStatus.UNAUTHORIZED.value()
			+ ": User does not have access to do the mentioned change";
	public static final String INVALID_REQUEST = "UM1002 " + HttpStatus.BAD_REQUEST.value()
			+ ": Invalid Request or Request Parameters";
	public static final String USER_NOT_PRESENT = "UM1003 " + HttpStatus.BAD_REQUEST.value()
			+ ": Given user does not exist";
	public static final String INVALID_DELETE_DISCUSSION_REQUEST = "UM1004 " + HttpStatus.BAD_REQUEST.value()
			+ ": Invalid Request";
	public static final String QUESTION_NOT_PRESENT = "UM1005 " + HttpStatus.BAD_REQUEST.value()
			+ ": Given question does not exist";
	public static final String ANSWER_NOT_PRESENT = "UM1005 " + HttpStatus.BAD_REQUEST.value()
			+ ": Given answer does not exist";
	public static final String CATEGORY_NOT_PRESENT = "UM1006 " + HttpStatus.BAD_REQUEST.value()
			+ ": Given category does not exist";
}
