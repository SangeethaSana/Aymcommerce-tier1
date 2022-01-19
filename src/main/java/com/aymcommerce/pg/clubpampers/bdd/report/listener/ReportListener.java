package com.aymcommerce.pg.clubpampers.bdd.report.listener;

public interface ReportListener {

	void reportCreateFeature(String title);

	void reportFeatureLog(String info);

	void reportFeatureLogPass(String info);

	void reportFeatureLogFatal(String Info);

	void reportCreateScenario(String Detail);

	void reportScenarioPass(String Details, String s);

	void reportScenarioPass(String Details);

	void reportScenarioFail(String Details);

	void reportScenarioFail(String Details, String s);

	void reportScenarioExpection(Exception e);

	void createStep(String keyword, String stepName) throws ClassNotFoundException;

	void reportStepPass(String Details, String s);

	void reportStepPass(String Details);

	void reportStepFail(String Details);

	void reportStepFail(String Details, String s);

	void reportStepExpection(Exception e);

}