package com.wang.cleancode.preferexceptions;

import java.util.logging.Logger;

public class DeletePreferExceptionHandler {
	Logger logger = Logger.getLogger("CLEAN_CODE");
	static final int E_OK = 0;
	static final int E_ERROR = 1;
	Page page = new Page();
	Registry registry = new Registry();
	ConfigKeys configKeys = new ConfigKeys();

	public static void main(String[] args){
		DeletePreferExceptionHandler d = new DeletePreferExceptionHandler();
		d.deleteWithPreferExceptionHandling();

	}
	int deleteWithPreferExceptionHandling() {
		try {
			deletePageAndAllReferences(page);
			logger.info("INFO: page delete with oneline in try-catch block.");
		} catch (Exception e) {
			logError(e);
		}
		return E_OK;
	}

	private void deletePageAndAllReferences(Page page) throws Exception {
		deletePage(page);
		registry.deleteReference(page.name);
		configKeys.deleteKey(page.name.makeKey());
	}

	private void logError(Exception e) {
		logger.info(e.getMessage());
	}

	int deleteWithSeparatedCode() {
		try {
			deletePage(page);
			registry.deleteReference(page.name);
			configKeys.deleteKey(page.name.makeKey());
		} catch (Exception e) {
			logger.info(e.getMessage());
			return E_ERROR;
		}
		logger.info("INFO: page deleted from separted deleting code.");
		return E_OK;
	}
	
	void deletePage(Page page) throws Exception{
		throw new Exception("Page cannot be deleted");
	}
}
