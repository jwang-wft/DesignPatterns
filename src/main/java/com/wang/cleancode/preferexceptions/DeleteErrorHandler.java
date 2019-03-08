package com.wang.cleancode.preferexceptions;

import java.util.logging.Logger;

public class DeleteErrorHandler {
	Logger logger = Logger.getLogger("CLEAN_CODE");
	static final int E_OK = 0;
	static final int E_ERROR = 1;
	Page page = new Page();
	Registry registry = new Registry();
	ConfigKeys configKeys = new ConfigKeys();

	public static void main(String[] args) {
		DeleteErrorHandler handler = new DeleteErrorHandler();
		handler.deleteWithBadCode();
	}

	int deleteWithBadCode() {
		if (deletePage(page) == E_OK) {
			if (registry.deleteReference(page.name) == E_OK) {
				if (configKeys.deleteKey(page.name.makeKey()) == E_OK) {
					logger.info("page deleted");
				} else {
					logger.info("configKey not deleted");
				}
			} else {
				logger.info("deleteReference from registry failed");
			}
		} else {
			logger.info("delete failed");
			return E_ERROR;
		}
		return E_OK;
	}

	int deletePage(Page page) {
		return E_OK;
	}
}

class Name {
	String makeKey() {
		return "name";
	}
}

class Page {
	Name name = new Name();
}

class Registry {
	int deleteReference(Name pageName){
		return DeleteErrorHandler.E_ERROR;
//		throw new Exception("Cannot delete the reference...");
	}
}

class ConfigKeys {
	int deleteKey(String key) {
		return DeleteErrorHandler.E_OK;
	}
}