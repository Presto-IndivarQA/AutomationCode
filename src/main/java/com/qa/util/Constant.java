package com.qa.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class Constant {

	static Map<String,String> defaultFun=new LinkedHashMap<String, String>();
	static Map<String,String> doLoginTest=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToSelectHospitalLocationTest=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToHISHomeTest=new LinkedHashMap<String, String>();
	//CDR
	
	static Map<String,String> doNavigateToCDRTest=new LinkedHashMap<String, String>();
	static Map<String,String> CDR_Patient_Folder_TC_03=new LinkedHashMap<String, String>();
	static Map<String,String> CDR_Patient_Folder_TC_04=new LinkedHashMap<String, String>();
	static Map<String,String> CDR_Patient_Folder_TC_05=new LinkedHashMap<String, String>();
	static Map<String,String> CDR_Patient_Folder_TC_06=new LinkedHashMap<String, String>();
	static Map<String,String> CDR_Patient_Folder_TC_07=new LinkedHashMap<String, String>();
	static Map<String,String> CDR_Patient_Folder_TC_08=new LinkedHashMap<String, String>();
	static Map<String,String> CDR_Patient_Folder_TC_09=new LinkedHashMap<String, String>();
	
	static Map<String,String> doNavigateToUHIDcreationLinkTest=new LinkedHashMap<String, String>();
	static Map<String,String> To_Check_Functionality_SaveButton=new LinkedHashMap<String, String>();
	static Map<String,String> To_Check_Functionality_UHIDSearch=new LinkedHashMap<String, String>();
	static Map<String,String> To_Check_Functionality_UpdateButton=new LinkedHashMap<String, String>();
	static Map<String,String> Check_the_Functionality_Of_OPDNumber=new LinkedHashMap<String, String>();
	static Map<String,String> Check_FunctionalityOf_ClearButton=new LinkedHashMap<String, String>();
	static Map<String,String> Search_Patient_detailBy_IPnumber=new LinkedHashMap<String, String>();
	
	
	
	
	static Map<String,String> doNavigateToPatientCheckInTest=new LinkedHashMap<String, String>();
	static Map<String,String> Check_TheFunctionality_IPNumber=new LinkedHashMap<String, String>();
	static Map<String,String> to_checkThe_functionality_PrintButton=new LinkedHashMap<String, String>();
	static Map<String,String> toCheck_theFunctionality_UHIDSearch=new LinkedHashMap<String, String>();
	
	static Map<String,String> doTestRefferls=new LinkedHashMap<String, String>();
	static Map<String,String> doTestTodays_Appointment_Button=new LinkedHashMap<String, String>();
	              //check in Admission Of Reffered patient            
	static Map<String,String> doNavigateToCheck_In_Admission_of_Reffered_PatientsLink=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Check_in_Admission_to_Referred_Patients_TC_1=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Check_in_Admission_to_Referred_Patients_TC_2=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Check_in_Admission_to_Referred_Patients_TC_3=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Check_in_Admission_to_Referred_Patients_TC_5=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Check_in_Admission_to_Referred_Patients_TC_6=new LinkedHashMap<String, String>();
	//patient admission
	
	static Map<String,String> doNavigateToPatientAdmissionTest=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Patient_Admission_TC_1=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Patient_Admission_TC_2=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Patient_Admission_TC_3=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Patient_Admission_TC_5=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Patient_Admission_TC_7=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Patient_Admission_TC_9=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Patient_Admission_TC_6=new LinkedHashMap<String, String>();

	
	
	
	//cancel Checck In
	static Map<String,String> doNavigateToCancelCheckinTest=new LinkedHashMap<String, String>();
	static Map<String,String> cencelcheck_ingetUHIdNumber=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Cancel_check_in_01=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Cancel_check_in_03=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Cancel_check_in_04=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Cancel_check_in_05=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Cancel_check_in_06=new LinkedHashMap<String, String>();
	
	//emargency Check In
	static Map<String,String> doNavigateToEmergency_Check_In_RegistrationPagesLink=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Emergency_Checkin_Registration_TC_1=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Emergency_Checkin_Registration_TC_2=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Emergency_Checkin_Registration_TC_3=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Emergency_Checkin_Registration_TC_4=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Emergency_Checkin_Registration_TC_5=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Emergency_Checkin_Registration_TC_7=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Emergency_Checkin_Registration_TC_8=new LinkedHashMap<String, String>();
	//bed status
	static Map<String,String> doNavigateToBedStatusLink=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Bed_Status_TC_1=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Bed_Status_TC_2=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Bed_Status_TC_3=new LinkedHashMap<String, String>();
	static Map<String,String> Registration_Bed_Status_TC_4=new LinkedHashMap<String, String>();
	//Registration Report
	static Map<String,String> DoNatigatetoLinkRegistration_Report=new LinkedHashMap<String, String>();
	static Map<String,String> RegistrationReport_TC_1=new LinkedHashMap<String, String>();
	static Map<String,String> RegistrationReport_TC_2=new LinkedHashMap<String, String>();
	static Map<String,String> RegistrationReport_TC_3=new LinkedHashMap<String, String>();
	static Map<String,String> RegistrationReport_TC_4=new LinkedHashMap<String, String>();
//ANM Services
	static Map<String,String> CLM_ANM_servicess_TC_004=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_ANM_servicess_TC_005=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_ANM_servicess_TC_006=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_ANM_servicess_TC_0010=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_ANM_servicess_TC_008=new LinkedHashMap<String, String>();
	
	
	static Map<String,String> doNavigateToDoctorWorklistTest=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToDoctorWorkListAndSelectMiniCaseSheet=new LinkedHashMap<String, String>();
	//minicase Sheet
	static Map<String,String> CLM_Mini_Standard_Casesheet_5=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Mini_Standard_Casesheet_6=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Mini_Standard_Casesheet_7=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Mini_Standard_Casesheet_8=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Mini_Standard_Casesheet_9=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Mini_Standard_Casesheet_10=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Mini_Standard_Casesheet_11=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Mini_Standard_Casesheet_15=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Mini_Standard_Casesheet_17=new LinkedHashMap<String, String>();
		
	static Map<String,String> doNavigateToClinicalRecord_DoctorWorkList=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforCheifComplain=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforHistoryofpresentIllness=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforPastHistory=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforGenralExamination=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforSystemicExamination=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforLocal_SpecialExamination=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforDiagnose=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforMedicine=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforInvestigation=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforHealthInvestigation=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforOrderPack=new LinkedHashMap<String, String>();
	
	static Map<String,String> doNavigatetoIPCaseshet=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToClinicalRecord_genrate_certificate=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToClinicalRecord_genrate_Maternitiy_certificate=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToClinicalRecord_Inpatients_EmergencyPatients=new LinkedHashMap<String, String>();
	static Map<String,String> doANMServicesTest=new LinkedHashMap<String, String>();
	
	static Map<String,String> doNavigateTogetDischargeIntimationLinkTest=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Discharge_Intimation_TC_4=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Discharge_Intimation_TC_5=new LinkedHashMap<String, String>();
	
	static Map<String,String> doNavigateToFUPTest=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Frequently_Used_Packs_TC_04=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Frequently_Used_Packs_TC_05=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Frequently_Used_Packs_TC_07=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToOrderPacksTest=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToDosageType=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Dosage_Types_TC_4=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Dosage_Types_TC_6=new LinkedHashMap<String, String>();
	
	static Map<String,String> CLM_Order_Packs_TC_03=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Order_Packs_TC_06=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Order_Packs_TC_04=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Order_Packs_TC_07=new LinkedHashMap<String, String>();
	//Discharge Sumarry
	static Map<String,String> doNavigateTogetDischargeSummaryLinkTest=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Discharge_Summary_TC_7=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Discharge_Summary_TC_6=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Discharge_Summary_TC_10=new LinkedHashMap<String, String>();
	static Map<String,String> donavigatetoInpatientRefferlWorklist=new LinkedHashMap<String, String>();
	//========open Visit
	static Map<String,String> doNavigateToOpenVisitTest=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Open_Visits_TC_5=new LinkedHashMap<String, String>();	
	static Map<String,String> CLM_Open_Visits_TC_6=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Open_Visits_TC_7=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Open_Visits_TC_8=new LinkedHashMap<String, String>();
	static Map<String,String> CLM_Open_Visits_TC_9=new LinkedHashMap<String, String>();
	
	static Map<String,String> doNavigateToEditCertificateTest=new LinkedHashMap<String, String>();
	static Map<String,String> CheckTheFunctionalityOfRequestForChangedUPdateButton=new LinkedHashMap<String, String>();
	static Map<String,String> ChecktheFunctionalityOftoNavigateToEditMeternityCertificatePages=new LinkedHashMap<String, String>();
	static Map<String,String> ChecktheFunctionalityOfUpdateButtonOfEditMeternityCertificatePages=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToClinical_Record_Reports=new LinkedHashMap<String, String>();
	static Map<String,String> checkTheFunctionalityOfItemMasterdata=new LinkedHashMap<String, String>();
	//clinical Reports
	static Map<String,String> checkTheFunctionalityOfprescreption_itemIssue=new LinkedHashMap<String, String>();
	static Map<String,String> checkTheFunctionalityOfStockStatus_StationWise=new LinkedHashMap<String, String>();
	static Map<String,String> checkTheFunctionalityOfExportReport=new LinkedHashMap<String, String>();
	static Map<String,String> ChecktheFunctionalityofClearButton=new LinkedHashMap<String, String>();
	
	static Map<String,String> donavigatetoworklaboratory=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigatetoChangeLocation=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigatetoIPCaseshetForLab=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToTestCaseForLabWorkListInpatient=new LinkedHashMap<String, String>();
	static Map<String,String> DoTestforTestresultEntry=new LinkedHashMap<String, String>();
	static Map<String,String> DonavigatetoBulkResultEntry=new LinkedHashMap<String, String>();
	static Map<String,String> changeHospitalLocationForBulkResultverificationTest=new LinkedHashMap<String, String>();
	static Map<String,String> TestCasefordDispatchReportInpatient=new LinkedHashMap<String, String>();
	static Map<String,String> changeHospitalLocationforgroup_printing_InpatientTest=new LinkedHashMap<String, String>();
	static Map<String,String> donavigateTolaboratoryTest=new LinkedHashMap<String, String>();
	static Map<String,String> donavigateTolaboratoryPrescriptionTest=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToImagingWorklistLinkTest=new LinkedHashMap<String, String>();
	static Map<String,String> doImagingWorklistOPFlowTest=new LinkedHashMap<String, String>();
	static Map<String,String> doImagingWorklistOPFlowPATest=new LinkedHashMap<String, String>();
	static Map<String,String> doImagingWorklistOPFlowTestPerfTest=new LinkedHashMap<String, String>();
	static Map<String,String> doImagingWorklistOPFlowResultEntryTest=new LinkedHashMap<String, String>();
	static Map<String,String> doImagingWorklistOPFlowResultverifyTest=new LinkedHashMap<String, String>();
	static Map<String,String> doImagingWorklistOPFlowDispatchTest=new LinkedHashMap<String, String>();
	static Map<String,String> doImagingWorklistIPFlowTest=new LinkedHashMap<String, String>();
	static Map<String,String> doImagingWorklistIPFlowPATest=new LinkedHashMap<String, String>();
	static Map<String,String> doImagingWorklistIPFlowTestPerfTest=new LinkedHashMap<String, String>();
	static Map<String,String> doImagingWorklistIPFlowResultEntryTest=new LinkedHashMap<String, String>();
	
	
	//=====OPD Flow========
	static Map<String,String> doNavigateToPatientCheckinLinkTest=new LinkedHashMap<String, String>();
	static Map<String,String> doCreateCheckInPageTest=new LinkedHashMap<String, String>();
	static Map<String,String> dodoctorworklist=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToHISHomeTestforfacilityStore=new LinkedHashMap<String, String>();
	static Map<String,String> dofacilityStore=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToHISHomeTestforLaboratoryworklist=new LinkedHashMap<String, String>();
	static Map<String,String> testcaseforLaboratoryworkListOPD=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToHISHomeTestforImagingServices=new LinkedHashMap<String, String>();
	static Map<String,String> doImagingServices=new LinkedHashMap<String, String>();
	//========IPD Flow=====
	static Map<String,String> dotestcaseIPDFlowPagepatientAddmission=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseIPDFlowPagepatientInpatientmanagement=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseIPDFlowPagepatientIPcasesheetPrecription=new LinkedHashMap<String, String>();
	static Map<String,String> testcaseforInpatientIssues=new LinkedHashMap<String, String>();
	static Map<String,String> testcaseforLaboratory=new LinkedHashMap<String, String>();
	static Map<String,String> TestcaseforImaggingServices=new LinkedHashMap<String, String>();
	static Map<String,String> TestcaseforDischageIntimation=new LinkedHashMap<String, String>();
	
	//==========medical Record========
	static Map<String,String> testcaseforDeathRecrd=new LinkedHashMap<String, String>();
	static Map<String,String> changeHospitalLocationTest=new LinkedHashMap<String, String>();
	static Map<String,String> testcaseforbirthRegistration=new LinkedHashMap<String, String>();
	//=========Store========
	static Map<String,String> doNavigateToPhysicalStockEntryLink=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Physical_Stock_Entry_004=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Physical_Stock_Entry_005=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Physical_Stock_Entry_006=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Physical_Stock_Entry_007=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Physical_Stock_Entry_008=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Physical_Stock_Entry_012=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateAlterMRPLinkTest=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Alter_MRP_004=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Alter_MRP_005=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Alter_MRP_007=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateAdjustmentLinkTest=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Adjustment_004=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Adjustment_005=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Adjustment_006=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Adjustment_008=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Adjustment_009=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Adjustment_010=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Adjustment_011=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Adjustment_012=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateStoreConsumptionTest=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Consumption_004=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Consumption_005=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Consumption_006=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Consumption_009=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Consumption_010=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Consumption_011=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Consumption_012=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateLossBreakageLinkTest=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Loss_and_Breakage_004=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Loss_and_Breakage_005=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Loss_and_Breakage_006=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Loss_and_Breakage_009=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Loss_and_Breakage_010=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Loss_and_Breakage_011=new LinkedHashMap<String, String>();
	static Map<String,String> TC_Store_Loss_and_Breakage_012=new LinkedHashMap<String, String>();
	static Map<String,String> donavigateToDownloadCRCItemTest=new LinkedHashMap<String, String>();
	static Map<String,String> doTestForDownloadCRCItemListTest=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateIndentOrderLinkTest=new LinkedHashMap<String, String>();
	static Map<String,String> doIndentOrderTest=new LinkedHashMap<String, String>();
	static Map<String,String> doIndentWorklistViewIndentApproveFromStoreTest=new LinkedHashMap<String, String>();
	static Map<String,String> doIndentWorklistViewIndentApproveToStoreTest=new LinkedHashMap<String, String>();
	static Map<String,String> doIndentWorklistIssueIndentToStoreTest=new LinkedHashMap<String, String>();
	static Map<String,String> WardBedStatus=new LinkedHashMap<String, String>();
	static Map<String,String> WardDashBoard=new LinkedHashMap<String, String>();
	static Map<String,String> PatientDischarge=new LinkedHashMap<String, String>();
	static Map<String,String> PrimaryDoctorChange=new LinkedHashMap<String, String>();
	static Map<String,String> NurseTasks=new LinkedHashMap<String, String>();
	static Map<String,String> BedsideProceduresOrder=new LinkedHashMap<String, String>();
	static Map<String,String> specialtyprocedurerequest=new LinkedHashMap<String, String>();
	static Map<String,String> ProgressNotes=new LinkedHashMap<String, String>();
	static Map<String,String> VitalsEntry=new LinkedHashMap<String, String>();
	static Map<String,String> IntakeOutputEntry=new LinkedHashMap<String, String>();
	static Map<String,String> WardUnit=new LinkedHashMap<String, String>();
	static Map<String,String> Transferbed=new LinkedHashMap<String, String>();
	static Map<String,String> InvestigationRequest=new LinkedHashMap<String, String>();
	static Map<String,String> TranferRequestofWard=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateTopatientCheck_in_Link=new LinkedHashMap<String, String>();
	static Map<String,String> doTestForcreatePatientCheck_IN=new LinkedHashMap<String, String>();
	static Map<String,String> dotestforOT_PAC=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToOTandResourceSchedulingTest=new LinkedHashMap<String, String>();
	static Map<String,String> doOTandResourceSchedulingnTest=new LinkedHashMap<String, String>();
	static Map<String,String> dotestcaseforotoperativeotnotesLink=new LinkedHashMap<String, String>();
	static Map<String,String> doNavigateToOTPrescriptionLink=new LinkedHashMap<String, String>();
	static Map<String,String> donavigateTotestcaseOTprescription=new LinkedHashMap<String, String>();
	
	
	//Audio Video
	
	static Map<String,String> doNavigateToDrWorkList=new LinkedHashMap<String, String>();
	static Map<String,String> donavigatetoVideoConsultationpage=new LinkedHashMap<String, String>();
	static Map<String,String> CheckFunctionalityOfChiefComplants=new LinkedHashMap<String, String>();
	static Map<String,String> CheckFunctionalityOfPastHistory=new LinkedHashMap<String, String>();
	static Map<String,String> CheckFunctionalityOfHistoryOfPresentillness=new LinkedHashMap<String, String>();
	static Map<String,String> CheckFunctionalityOfRefferalAdvice=new LinkedHashMap<String, String>();
	static Map<String,String> CheckFunctionalityOfFollowUp=new LinkedHashMap<String, String>();
	static Map<String,String> CheckFunctionalityofmedicationInPrescriptions=new LinkedHashMap<String, String>();
	static Map<String,String> CheckFunctionalityOfInvesitgationPrescriptions=new LinkedHashMap<String, String>();
	static Map<String,String> CheckFunctionalityOfDiagnosisPrescriptions=new LinkedHashMap<String, String>();
	static Map<String,String> CheckFunctionalityOfclinicaladvicePrescriptions=new LinkedHashMap<String, String>();







	
	
	
	static{
//		defaultFun.put("default","TestCase-1");
//		defaultFun.put("default-2","TestCaseId-2");
		//====================================
		doLoginTest.put("Enter User Name","applone");
		doLoginTest.put("Enter Pass word","*********");
//		Login.put("Click Login button","TestCaseId-1");
//		Login.put("Verify sucess fully login","TestCaseId-1");
		//====================================
		doNavigateToCDRTest.put("Step-1", "Go to CDR Link");
		doNavigateToCDRTest.put("Step-2", "Select PatientFolder Link ");
		
		//=====================================
		doNavigateToSelectHospitalLocationTest.put("Navigate to Hospital location Pages ","Go to Applocation Select HIS");		
		CDR_Patient_Folder_TC_03.put("Step-1 Enter the IPNumber ", "1111111111");
		CDR_Patient_Folder_TC_03.put("Step-2 Click on Search ", " Click on SEARCH Button");
		
		//========================================
		doNavigateToHISHomeTest.put("Step-1 Select Location", "ESIC TEST HOSPITAL DL");
		doNavigateToHISHomeTest.put("Step-2 Select Facility", "ADMINSTRATIVE SERVICES");
		doNavigateToHISHomeTest.put("Step-3 Select Submit Button", "Click on Submit button");
		
		//=================CDR==========================
		CDR_Patient_Folder_TC_03.put("Test Objective", "The objective of the test case is to check the functionality of search button");
		CDR_Patient_Folder_TC_03.put("Step-1", "Login to  with valid credentials  ");
		CDR_Patient_Folder_TC_03.put("Step-2", "Select Location asESIC Test Hospital");
		CDR_Patient_Folder_TC_03.put("Step-3", "Select Facility as adminstrative Services");
		CDR_Patient_Folder_TC_03.put("Step-4", "click submit button");
		CDR_Patient_Folder_TC_03.put("Step-5", "Mouse Hover on CDR and click Patient Folder");
		CDR_Patient_Folder_TC_03.put("Step-6", "Enter UHID/IP/Name and click on Search button");
		CDR_Patient_Folder_TC_03.put("Expected Behaviour", "Login to  with valid credentials  ");
		CDR_Patient_Folder_TC_04.put("Test Objective", "The objective of the test case is to check the functionality of select Link");
		CDR_Patient_Folder_TC_04.put("Step-1", "Click on Select Link");
		CDR_Patient_Folder_TC_04.put("Expected Behaviour", "System should display demographic details of the patient.");
		CDR_Patient_Folder_TC_05.put("Test Objective", "The objective of the test case is to check the functionality of fetch clinical records button");
		CDR_Patient_Folder_TC_05.put("Step-1", "Click on Fetch Clinical Records");
		CDR_Patient_Folder_TC_05.put("Expected Behaviour", "System should display patient folder with correct patient information. 2. Patient folder screen should display the following fileds as a) Episode Wise  along with radio button b) Specialisation  along with radio button and drop down options c) Diagnosis along with radi button and drop down options");
		CDR_Patient_Folder_TC_06.put("Test Objective", "The objective of the test case is to check the functionality of Episode wise Radio button button");
		CDR_Patient_Folder_TC_06.put("Step-1", "Click on Date link of Episode wise");
		CDR_Patient_Folder_TC_06.put("Expected Behaviour", "Prescriptions, health intervention, vitals, immunazation, surgery etc should display if previously given for the patient");
		CDR_Patient_Folder_TC_07.put("Test Objective", "The objective of the test case is to check the functionality of specialisation Radio button button");
		CDR_Patient_Folder_TC_07.put("Step-1", "Click on Specilization Radio Button");
		CDR_Patient_Folder_TC_07.put("Step-2", "Select on ENT Otorhynolaryngology in Specilization DropDown List");
		CDR_Patient_Folder_TC_07.put("Step-3", "Click on Surgery General Medicine Dispensary Clinic in Specilization DropDown List");
		CDR_Patient_Folder_TC_07.put("Step-4", "Click on EchoCardiography in Specilization DropDown List");
		CDR_Patient_Folder_TC_07.put("Step-5", "Click on ECG(Electrocardiography) in Specilization DropDown List");
		CDR_Patient_Folder_TC_07.put("Step-6", "Click on Medicine Casualty / Emergency in Specilization DropDown List");
		CDR_Patient_Folder_TC_07.put("Step-7", "Click on Orthopaedic Surgery in Specilization DropDown List");
		CDR_Patient_Folder_TC_07.put("Expected Behaviour", "Prescriptions, health intervention, vitals, immunazation, surgery etc should display if previously given for the patient");
		CDR_Patient_Folder_TC_08.put("Test Step", "The objective of the test case is to check the functionality of Diagnosis  Radio button button");
		CDR_Patient_Folder_TC_08.put("Step-1", "Click on Diagnose Radio Button");
		CDR_Patient_Folder_TC_08.put("Step-2", "Select on Cervical disc disorders in Diagnose DropDown List");
		CDR_Patient_Folder_TC_08.put("Step-3", "Select on Other arthritis in Diagnose DropDown List");
		CDR_Patient_Folder_TC_08.put("Step-4", "Select on Viral infection of unspecified site in Diagnose DropDown List");
		CDR_Patient_Folder_TC_08.put("Step-5", "Select on Viral infection, unspecified in Diagnose DropDown List");
		CDR_Patient_Folder_TC_08.put("Step-6", "Select on Female gonococcal pelvic inflammatory disease (A54.2+) in Diagnose DropDown List");
		CDR_Patient_Folder_TC_08.put("Step-7", "Select on Abscess of lung with pneumonia in Diagnose DropDown List");
		CDR_Patient_Folder_TC_08.put("Step-8", "Select on Typhoid fever in Diagnose DropDown List");
		CDR_Patient_Folder_TC_08.put("Step-9", "Click on Episode Wise Radio Button");
		CDR_Patient_Folder_TC_08.put("Expected Behaviour", "Prescriptions, health intervention, vitals, immunazation, surgery etc should display if previously given for the patient");
		CDR_Patient_Folder_TC_09.put("Test Objective", "The objective of the test case is to check the Functionality of Prescription,health intervention, vitals, immunization and surgery link etc");
		CDR_Patient_Folder_TC_09.put("Step-1", "click on Prescription or health intervention or vitals or immunization or surgery link etc");
		CDR_Patient_Folder_TC_09.put("Expected Behaviour", "Prescriptions, health intervention, vitals, immunazation, surgery etc should display in tabular format.");
		//==================UHID Creation Test=============
		doNavigateToUHIDcreationLinkTest.put("Step-1", "go to Registration and select the UHID Link");
		To_Check_Functionality_SaveButton.put("Step-1", "Enetr the Mandatory field");
		To_Check_Functionality_SaveButton.put("Step-2", "Click on Save Button");
		Check_the_Functionality_Of_OPDNumber.put("Step-1", "Click on OPD Number Button");
		Check_the_Functionality_Of_OPDNumber.put("Step-2", "Click on Registration");
		To_Check_Functionality_UHIDSearch.put("Step-1", "Enter the UHID Click on Search Button");
		To_Check_Functionality_UHIDSearch.put("Step-2", "Search The UHID and Click on Select Button");
		To_Check_Functionality_UHIDSearch.put("Step-3", "Click on Same As Permanant Check Box  ");
		To_Check_Functionality_UpdateButton.put("Step-1", "Click on Update Button  ");
		Check_FunctionalityOf_ClearButton.put("Step-1", "Enetr the Mandatory field");
		Check_FunctionalityOf_ClearButton.put("Step-2", "Click on Clear Button");
		Search_Patient_detailBy_IPnumber.put("Step-1", "Enter the IP Number Click on Live List");
		Search_Patient_detailBy_IPnumber.put("Step-2", "Select the patient And Click on Select Button");
		//==================Patient Check in=============
		doNavigateToPatientCheckInTest.put("Step-1", "go to Registration and select the Patient Check in Link");
		Check_TheFunctionality_IPNumber.put("Step-1", "Select the data by IP Number");
		Check_TheFunctionality_IPNumber.put("Step-2", "Click on Specialization OK Button");
		Check_TheFunctionality_IPNumber.put("Step-3", "Click on Save Button");
		to_checkThe_functionality_PrintButton.put("Step-1", "get the Patient Check_IN");
		to_checkThe_functionality_PrintButton.put("Step-2", "click on yes button");
		toCheck_theFunctionality_UHIDSearch.put("Step-1","click on UHID Search Image");
		toCheck_theFunctionality_UHIDSearch.put("Step-2","Enter the data in Text Box and Click on search Button");
		toCheck_theFunctionality_UHIDSearch.put("Step-3","Select patient Detail");
		toCheck_theFunctionality_UHIDSearch.put("Step-4","Click on Save Button");
		doTestRefferls.put("Step-1", "Click on Refferls Link");
		doTestRefferls.put("Step-2", "Enter the the IP Number click on Live List.");
		doTestRefferls.put("Step-3", "Select the Patient click on Select Button");
		doTestRefferls.put("Step-4", "Click on Check_in");
		doTestTodays_Appointment_Button.put("Step-1","Change the Location(Azadpur)");
		doTestTodays_Appointment_Button.put("Step-2","go to registration select the patient Check In");
		doTestTodays_Appointment_Button.put("Step-3","Click on Today Appointments Button");
		
		//==================Check_In_Admission_of_Reffered_PatientsTest=============
		doNavigateToCheck_In_Admission_of_Reffered_PatientsLink.put("Step-1", "go to Registration and select the Check_In_Admission_of_Reffered_Patients Link");
		Registration_Check_in_Admission_to_Referred_Patients_TC_1.put("Step-1", "Click on the UHID Search screen");
		Registration_Check_in_Admission_to_Referred_Patients_TC_1.put("Step-2", "Enter data in any of the searching criteria");
		Registration_Check_in_Admission_to_Referred_Patients_TC_1.put("Step-3", "Click on search");
		Registration_Check_in_Admission_to_Referred_Patients_TC_2.put("Step-1", "Enter 10 digit IP No. in the IP no textbox");
		Registration_Check_in_Admission_to_Referred_Patients_TC_2.put("Step-2", "Click on Live list");
		Registration_Check_in_Admission_to_Referred_Patients_TC_3.put("Step-1", "Fetch patient advised to be admitted");
		Registration_Check_in_Admission_to_Referred_Patients_TC_3.put("Step-2", "Click on Admit link");
		Registration_Check_in_Admission_to_Referred_Patients_TC_5.put("Step-1", "Enter any details in the Patient Check-In/Admission of Referred Patients Screen");
		Registration_Check_in_Admission_to_Referred_Patients_TC_5.put("Step-2", "Click on Clear Button");
		Registration_Check_in_Admission_to_Referred_Patients_TC_6.put("Step-1", " Enter data  as abcd122434 in IP No textbox.");
		Registration_Check_in_Admission_to_Referred_Patients_TC_6.put("Step-2", " Click on Live list link");
		//==================Patient Admission Test=============
		doNavigateToPatientAdmissionTest.put("Step-1", "go to Registration and select the Patient Admission Link");
		Registration_Patient_Admission_TC_1.put("Step-1", "Fetch patient Detail");
		Registration_Patient_Admission_TC_1.put("Step-2", "Fill mandatory fields");
		Registration_Patient_Admission_TC_1.put("Step-3", "Click on Save Button");
		Registration_Patient_Admission_TC_2.put("Step-1", "Fetch patient Detail");
		Registration_Patient_Admission_TC_2.put("Step-2", "Edit Detail");
		Registration_Patient_Admission_TC_2.put("Step-3", "Click on Modify Button");
		Registration_Patient_Admission_TC_3.put("Step-1", "Click on Print Button");
		Registration_Patient_Admission_TC_5.put("Step-1", "Fetch the admitted patient ");
		Registration_Patient_Admission_TC_5.put("Step-2", "Click on Deposit button");
		Registration_Patient_Admission_TC_5.put("Step-3", "Enter the amount Click on Ok Button");
		Registration_Patient_Admission_TC_7.put("Step-1", "Click on New Born Check Box");
		Registration_Patient_Admission_TC_7.put("Step-2", "Fatch the Mother Detail");
		Registration_Patient_Admission_TC_7.put("Step-3", "Fill The Mandatory Field");
		Registration_Patient_Admission_TC_7.put("Step-4", "Click on Save Button");
		Registration_Patient_Admission_TC_9.put("Step-1", "Click on Admission no search icon");
		Registration_Patient_Admission_TC_9.put("Step-2", "Enter data in any of the searching criteria");
		Registration_Patient_Admission_TC_9.put("Step-3", "Click on search");
		Registration_Patient_Admission_TC_6.put("Step-1", "Fetch the admitted patient");
		Registration_Patient_Admission_TC_6.put("Step-2", "Click on Cancel Button");
		
		
		//==================Cancel Check In Test=============
		doNavigateToCancelCheckinTest.put("Step-1", "go to Registration and select the Cancel Check_in Link");
		Registration_Cancel_check_in_01.put("Test Objective", "The objective of the test case is to verify the functionality of Cancel check in button on the Cancel check in screen.");
		Registration_Cancel_check_in_01.put("Step-1", "Fetch the checkin using checkin no search icon.");
		Registration_Cancel_check_in_01.put("Step-2", "Select the check box displayed just after the details.");
		Registration_Cancel_check_in_01.put("Step-3", "Click on the Cancel check in button");
		Registration_Cancel_check_in_01.put("Expected Behaviour", "Message 'Check-in(s) Cancelled Successfully' should be displayed");
		Registration_Cancel_check_in_03.put("Test Objective", "The objective of the test case is to verify the functionality of Cancel check in screen.");
		Registration_Cancel_check_in_03.put("Step-1", " Fetch one UHID for which check-in not created .");
		Registration_Cancel_check_in_03.put("Step-2", "Observe");
		Registration_Cancel_check_in_03.put("Expected Behaviour", "System should throw an information message saying  ' No Record(s) Found 'with OK and Cancel button.");
		Registration_Cancel_check_in_04.put("Test Objective", "The objective of the test case is to verify the functionality of Cancel check in button on the Cancel check in screen.");
		Registration_Cancel_check_in_04.put("Step-1", "Fetch the checkin using checkin no search icon");
		Registration_Cancel_check_in_04.put("Step-2", "Don’t Select the check box  displayed just after the details.");
		Registration_Cancel_check_in_04.put("Step-3", "Click on the Cancel check in button.");
		Registration_Cancel_check_in_04.put("Expected Behaviour", "Information message box should be displayed “Select at least one Record ” with OK and Cancel button");
		Registration_Cancel_check_in_05.put("Test Objective", "The objective of the test case is to verify the functionality of clear button on the Cancel check in screen.");
		Registration_Cancel_check_in_05.put("Step-1", "Fetch the checkin using checkin no search icon.");
		Registration_Cancel_check_in_05.put("Step-2", " Select the check box Presented just after the details");
		Registration_Cancel_check_in_05.put("Step-3", "Click on the Clear button.");
		Registration_Cancel_check_in_05.put("Expected Behaviour", "Screen should get cleared.");
		Registration_Cancel_check_in_06.put("Test Objective", "The objective of the test case is to verify the functionality of Cancel check in button when user select Multiple Check-in on the Cancel check in screen.");
		Registration_Cancel_check_in_06.put("Step-1", "Fetch the checkin using UHID search icon.");
		Registration_Cancel_check_in_06.put("Step-2", "Select two check box Presented just after the details");
		Registration_Cancel_check_in_06.put("Step-3", "Click on the Cancel check in button.");
		Registration_Cancel_check_in_06.put("Expected Behaviour", "System should display a success message box saying “Check-in(s) Cancelled Successfully”.");

		//==================Emergency_Check_In_RegistrationPage=============
		doNavigateToEmergency_Check_In_RegistrationPagesLink.put("Step-1", "go to Registration and select the Emergency_Check_In_Registration Link");
		Registration_Emergency_Checkin_Registration_TC_1.put("Test Objective", "The objective of the test case is to check the functionality of Save Button in Emergency checkin/Registration screen.");
		Registration_Emergency_Checkin_Registration_TC_1.put("Step-1", "Fetch patient");
		Registration_Emergency_Checkin_Registration_TC_1.put("Step-2", "Fill mandatory fields");
		Registration_Emergency_Checkin_Registration_TC_1.put("Step-3", "Click on save Button");
		Registration_Emergency_Checkin_Registration_TC_1.put("Expected Behaviour", "Message 'Record saved successfully Emergency Checkin No.:XXXXXXXXXXX' should display");
		Registration_Emergency_Checkin_Registration_TC_2.put("Test Objective", "The objective of the test case is to check the functionality of Modify Button in Emergency checkin/Registration screen");
		Registration_Emergency_Checkin_Registration_TC_2.put("Step-1", "Fetch patient using Admission no search icon.");
		Registration_Emergency_Checkin_Registration_TC_2.put("Step-2", "Edit details");
		Registration_Emergency_Checkin_Registration_TC_2.put("Step-3", "Click on Modify Button");
		Registration_Emergency_Checkin_Registration_TC_2.put("Expected Behaviour", "Message 'Record Modified Successfully'should display");
		Registration_Emergency_Checkin_Registration_TC_3.put("Test Objective", "The objective of the test case is to check the functionality of Print button in  Emergency checkin/Registration screen.");
		Registration_Emergency_Checkin_Registration_TC_3.put("Step-1", "Fetch patient using Admission no search icon.");
		Registration_Emergency_Checkin_Registration_TC_3.put("Step-2", "Click on Print Button");
		Registration_Emergency_Checkin_Registration_TC_3.put("Expected Behaviour", "Patient Admission Record report should display with the correct saved details ");
		Registration_Emergency_Checkin_Registration_TC_4.put("Test Objective", "The objective of the test case is to check the functionality of Clear button in  Emergency checkin/Registration screen.");
		Registration_Emergency_Checkin_Registration_TC_4.put("Step-1", "Enter any details in the Emergency Admission");
		Registration_Emergency_Checkin_Registration_TC_4.put("Step-2", "click on Clear Button");
		Registration_Emergency_Checkin_Registration_TC_4.put("Expected Behaviour", "All the details should get cleared & all dropdown's set to default ");
		Registration_Emergency_Checkin_Registration_TC_5.put("Test Objective", "The objective of the test case is to check the functionality of Deposit button in  Emergency checkin/Registration screen.");
		Registration_Emergency_Checkin_Registration_TC_5.put("Step-1", "Fetch the admitted patient ");
		Registration_Emergency_Checkin_Registration_TC_5.put("Step-2", "click on Deposit Button");
		Registration_Emergency_Checkin_Registration_TC_5.put("Expected Behaviour", "Deposit details pop up should be displayed Enter amount and click on OK");
		Registration_Emergency_Checkin_Registration_TC_7.put("Test Objective", "The objective of the test case is to check the functionality of fetching patient by UHID Search in Emergency checkin/Registration screen");
		Registration_Emergency_Checkin_Registration_TC_7.put("Step-1", "Click on UHID search icon.");
		Registration_Emergency_Checkin_Registration_TC_7.put("Step-2", "Enter data in any of the searching criteria");
		Registration_Emergency_Checkin_Registration_TC_7.put("Step-3", "Click on search");
		Registration_Emergency_Checkin_Registration_TC_7.put("Expected Behaviour", "All the searched data should display in the Search grid. Select any patient & Click on Select");
		Registration_Emergency_Checkin_Registration_TC_8.put("Test Objective", "The objective of the test case is to check the functionality of fetching patient by Admission No Search in Emergency checkin/Registration screen");
		Registration_Emergency_Checkin_Registration_TC_8.put("Step-1", "Click on Admission no search icon.");
		Registration_Emergency_Checkin_Registration_TC_8.put("Step-2", "Enter data in any of the searching criteria");
		Registration_Emergency_Checkin_Registration_TC_8.put("Step-3", "Click on search");
		Registration_Emergency_Checkin_Registration_TC_8.put("Expected Behaviour", "All the searched data should display in the Search grid.Select any patient & Click on Select");
		
		
		//==================Bed Status Pages=============
		doNavigateToBedStatusLink.put("Step-1","Go to Registration and Select the Bed Staus Link");
		Registration_Bed_Status_TC_1.put("Test Objective", "The objective of the test case is to check the functionality of bed status screen");
		Registration_Bed_Status_TC_1.put("Step-1", "Select any ward and an allocated not occupied bed(yellow icon)");
		Registration_Bed_Status_TC_1.put("Step-2", "observe");
		Registration_Bed_Status_TC_2.put("Test Objective", "The objective of the test case is to check the functionality of bed status screen");
		Registration_Bed_Status_TC_2.put("Step-1", "Select any ward and an occupied bed(red icon)");
		Registration_Bed_Status_TC_2.put("Step-2", "observe");
		Registration_Bed_Status_TC_3.put("Test Objective", "The objective of the test case is to check the functionality of bed status screen");
		Registration_Bed_Status_TC_3.put("Step-1", "Select any ward and a vacant bed(green icon)");
		Registration_Bed_Status_TC_3.put("Step-2", "observe");
		Registration_Bed_Status_TC_4.put("Test Objective", "The objective of the test case is to check the functionality of bed status screen");
		Registration_Bed_Status_TC_4.put("Step-1", "Select any ward and an extra bed(green icon)");
		Registration_Bed_Status_TC_4.put("Step-2", "observe");
		//==================Registration report
		DoNatigatetoLinkRegistration_Report.put("Step-1", "Go to Registration and click on Registration Report");
		RegistrationReport_TC_1.put("Test Objective", "Test Objective is to Check the Functionality of calender for selecting the Future Date");
		RegistrationReport_TC_1.put("Step-1", "Click on OPD Check-In Vs Doctor Visits and click on calander");
		RegistrationReport_TC_1.put("Step-2", "Select future Date");
		RegistrationReport_TC_1.put("Step-3", "Observe");
		RegistrationReport_TC_1.put("Expected Behaviour", "Alert Box should is display With 'From Date Cannot be Greater than Current Date' with Ok Button");
		RegistrationReport_TC_2.put("Test Objective", "Test Objective is to Check the Functionality of preview Button");
		RegistrationReport_TC_2.put("Step-1", "Click on OPD Check-In Vs Doctor Visits and click on calander");
		RegistrationReport_TC_2.put("Step-2", "Select current Date");
		RegistrationReport_TC_2.put("Step-3", "Click on Preview Button");
		RegistrationReport_TC_2.put("Expected Behaviour", "Report Should be Display with Export,Print and Go to Button");
		RegistrationReport_TC_3.put("Test Objective", "Test Objective is to Check the Functionality of Export Button");
		RegistrationReport_TC_3.put("Step-1", "Click on OPD Check-In Vs Doctor Visits and click on calander");
		RegistrationReport_TC_3.put("Step-2", "Select current Date");
		RegistrationReport_TC_3.put("Step-3", "Click on Preview Button");
		RegistrationReport_TC_3.put("Step-4", "Click on click on Export button");
		RegistrationReport_TC_3.put("Step-5", "Select the Formet Type");
		RegistrationReport_TC_3.put("Step-6", "Click on Ok Button");
		RegistrationReport_TC_3.put("Expected Behaviour", "Report Should be Export as selected Export");
		RegistrationReport_TC_4.put("Test Objective", "The Objective Of test case is to Check the Functionality Of Clear Button");
		RegistrationReport_TC_4.put("Step-1", "Click on Clear Button");
		RegistrationReport_TC_4.put("Expected Behaviour", "Clear the All Field");
		
		
		 
		//==================doctor Worklist==============
		doNavigateToDoctorWorklistTest.put("Step-1", "Go to Clinical Record Select the Doctor Work List");
		doNavigateToDoctorWorklistTest.put("Step-2", "Click on Check in And click on Back Button");
		doNavigateToDoctorWorklistTest.put("Step-3", "Search the check in from Check in Text Box");
		doNavigateToDoctorWorklistTest.put("Step-4", "Click on Cencel Button Give the Reason click on Ok Button");
		doNavigateToDoctorWorkListAndSelectMiniCaseSheet.put("Step-1", "Go to Clinical Record and Search the Check in");
		doNavigateToDoctorWorkListAndSelectMiniCaseSheet.put("Step-2", "Click on MinicaseSheet and Enter the Data Click on Save Button");
		//==================Mini CaseSheet==============
		CLM_Mini_Standard_Casesheet_5.put("Test Objective", "The objective of the test case is to check the functionality of Check-in no. search");
		CLM_Mini_Standard_Casesheet_5.put("Step-1", "Enter Check-in no");
		CLM_Mini_Standard_Casesheet_5.put("Step-2", "Click on Search button");
		CLM_Mini_Standard_Casesheet_5.put("Expected Behaviour", "The \"Patient check in details\" should pop up and user can navigate to Patient Case sheet or Patient Minicasesheet(only for new patients)");
		CLM_Mini_Standard_Casesheet_6.put("Test Objective", "The objective of this test case is to verify the if complaints /Examination/ diagnosis are getting saved once clicked on   Save Button");
		CLM_Mini_Standard_Casesheet_6.put("Step-1", "Enter valid Complaints /Examination/ diagnosis in MINI case sheet");
		CLM_Mini_Standard_Casesheet_6.put("Step-2", "click on Save Button");
		CLM_Mini_Standard_Casesheet_6.put("Expectd Behaviour", "Complaints /Examination/ diagnosis should be saved without any error and after saving, focus should be  on patient minicasesheet & data should be cleared");
		CLM_Mini_Standard_Casesheet_7.put("Test Objective", "The objective of this test case is to verify the if prescriptions are getting saved once navigated through Prescription Button");
		CLM_Mini_Standard_Casesheet_7.put("Step-1", "Make a check in to specialization");
		CLM_Mini_Standard_Casesheet_7.put("Step-2", "Click on Clinical records-->Doctors work list-->Specialization tab-->Click on Mini Case sheet Open link");
		CLM_Mini_Standard_Casesheet_7.put("Step-3", "Click on Prescription/OrderPack button");
		CLM_Mini_Standard_Casesheet_7.put("Step-4", "Prescription screen should be displayed, enter drug/Investigation/Health Interventions and save it");
		CLM_Mini_Standard_Casesheet_7.put("Expected Behaviour", "Prescriptions should be saved without any error and after closing the prescription screen it should focus on patient minicasesheet");
		CLM_Mini_Standard_Casesheet_8.put("Test Objective", "The objective of the test case is to check the functionality of Investigation button in Mini Case sheet");
		CLM_Mini_Standard_Casesheet_8.put("Step-1", "Select Single/ Multiple Investigation(Search & Select and FUP)");
		CLM_Mini_Standard_Casesheet_8.put("Step-2", " Enter other mandatory fields ");
		CLM_Mini_Standard_Casesheet_8.put("Step-3", "Click on Save & Close button");
		CLM_Mini_Standard_Casesheet_8.put("Expected Behaviour","Save & Close: The Investigation record gets saved and the screen should get closed");
		CLM_Mini_Standard_Casesheet_9.put("Test Objective", "The objective of the test case is to check the functionality of Medication button in Mini Case sheet");
		CLM_Mini_Standard_Casesheet_9.put("Step-1", ") Select Single/ Multiple Medication (Search & Select and FUP) ");
		CLM_Mini_Standard_Casesheet_9.put("Step-2", " Enter other mandatory fields ");
		CLM_Mini_Standard_Casesheet_9.put("Step-3", "Click on Save & Close button");
		CLM_Mini_Standard_Casesheet_9.put("Expected Behaviour","Save & Close: The Medication record gets saved and the screen should get closed");
		CLM_Mini_Standard_Casesheet_10.put("Test Objective", "The objective of the test case is to check the functionality of Health Interventions button in Mini Case sheet");
		CLM_Mini_Standard_Casesheet_10.put("Step-1", " Select Single/ Multiple Health Interventions (Search & Select and FUP");
		CLM_Mini_Standard_Casesheet_10.put("Step-2", "Enter other mandatory fields ");
		CLM_Mini_Standard_Casesheet_10.put("Step-3", "Save & Close");
		CLM_Mini_Standard_Casesheet_10.put("Expected Behaviour","Save & Close: The Health Interventions record gets saved and the screen should get closed");
		CLM_Mini_Standard_Casesheet_11.put("Test Objective", "The objective of the test case is to check the functionality of Advice button in Mini Case sheet");
		CLM_Mini_Standard_Casesheet_11.put("Step-1", "Enter Follow up/ Referral/ Admit/ Other Advice Interventions ");
		CLM_Mini_Standard_Casesheet_11.put("Step-2", "click on Save & Close");		
		CLM_Mini_Standard_Casesheet_11.put("Expected Behaviour", "Save & Close: The Advice record gets saved and the screen should get closed");
		CLM_Mini_Standard_Casesheet_15.put("Test Objective", "The objective of the test case is to check the functionality of Print button in Mini Case sheet");
		CLM_Mini_Standard_Casesheet_15.put("Step-1", "Click on Print Button");
		CLM_Mini_Standard_Casesheet_15.put("Expected Behaviout", "All the entries done should get printed.");
		CLM_Mini_Standard_Casesheet_17.put("Test Objective", "The objective of this test case is to verify the if system is redirecting user to the previous page once clicked on back Button");
		CLM_Mini_Standard_Casesheet_17.put("Step-1", "Enter valid Complaints /Examination/ diagnosis in MINI case sheet ");
		CLM_Mini_Standard_Casesheet_17.put("Step-2", "Click on back button");
		CLM_Mini_Standard_Casesheet_17.put("Expected Behaviour", "System should redirect user to previous page");
		
		//==================OP Case Sheet================
		doNavigateToClinicalRecord_DoctorWorkList.put("Step-1", "Go to doctor WorkList Click on patient Check in");
		doNavigateToClinicalRecord_DoctorWorkList.put("Step-2", "Open Case Sheet Select the OrderPack Click on Save Button");
		dotestcaseforCheifComplain.put("Step-1", "Clck on Chief Complain Link");
		dotestcaseforHistoryofpresentIllness.put("Step-1", "Click on HistoryofPresentIllness Link");
		dotestcaseforPastHistory.put("Step-1", "Click on PastHistory Link");
		dotestcaseforGenralExamination.put("Step-1", "Click on Genral Examination");
		dotestcaseforSystemicExamination.put("Step-1", "Click on System Examination");
		dotestcaseforLocal_SpecialExamination.put("Step-1", "Click on Local_SpecialExamination");
		dotestcaseforDiagnose.put("Step-1", "click on Diagnose Link");
		dotestcaseforMedicine.put("Step-1", "Click on Medicine Link");
		dotestcaseforInvestigation.put("Step-1", "Click on Investigation");
		dotestcaseforHealthInvestigation.put("Step-1", "Click on HealthInvestigation Link");
		dotestcaseforOrderPack.put("Step-1", "Click on OrderPack");
		//============IP caseSheet===========
		doNavigatetoIPCaseshet.put("Step-1", "Go To clnical Record Select the INpatient/Emergancy Patient Ckick on Admission ");
		doNavigatetoIPCaseshet.put("Step-2", "select the orderPack Click on Save Button");
		//============Certification Genration=====
		doNavigateToClinicalRecord_genrate_certificate.put("Step-1", "Go to clinical Record select the Certification Genration");
		doNavigateToClinicalRecord_genrate_certificate.put("Step-2", "Select the data And enter the Mandatory field");
		doNavigateToClinicalRecord_genrate_certificate.put("Step-3", "Click on Save button");
		doNavigateToClinicalRecord_genrate_certificate.put("Step-4", "Click on Print Button");
		//=========Maternity Certificate========
		doNavigateToClinicalRecord_genrate_Maternitiy_certificate.put("Step-1", "Go to clinical Record select the Maternity Genration");
		doNavigateToClinicalRecord_genrate_Maternitiy_certificate.put("Step-2", "Select the data And enter the Mandatory field");
		doNavigateToClinicalRecord_genrate_Maternitiy_certificate.put("Step-3", "Click on Save button");
		doNavigateToClinicalRecord_genrate_Maternitiy_certificate.put("Step-4", "Click on Print Button");
		//=========Inpatient/Emergancy Meeting====
		doNavigateToClinicalRecord_Inpatients_EmergencyPatients.put("Step-1", "Go to Clicnical Record And Select the Inpatient/Emergancy Patient Screen");
		doNavigateToClinicalRecord_Inpatients_EmergencyPatients.put("Step-2", "Click on Every Pluse Image Button");
		//========ANM services=====
		doANMServicesTest.put("Step-1", "Go to Clicnical Record And Select the ANM Services");
		CLM_ANM_servicess_TC_004.put("Test objective", "The objective of the test case is to check the functionality of fetching OP-Check in No");
		CLM_ANM_servicess_TC_004.put("Step-1", "Click on OP-Check in No. search button.");
		CLM_ANM_servicess_TC_004.put("Step-2", " Enter some search criteria and search the record.");
		CLM_ANM_servicess_TC_004.put("Step-3", "Click on Record");
		CLM_ANM_servicess_TC_004.put("Expected Behaviour", "The selected record should be displayed in ANM services screen with following details:\r\n"
				+ "1) Sl. No.\r\n"
				+ "2) Prescribed Item Name\r\n"
				+ "3) Item / Procedure Name \r\n"
				+ "4) Items \r\n"
				+ "5) Action Taken \r\n"
				+ "6) Remarks \r\n"
				+ "7) Delete  \r\n"
				+ "8) Delete Reason");
		CLM_ANM_servicess_TC_005.put("Test Objective", "The objective of the test case is to check the functionality of Save button when all the mandatory fields are entered and selected services as Procedures");
		CLM_ANM_servicess_TC_005.put("Step-1", "fetch patient details, select Procedures, select item, enter remarks ");
		CLM_ANM_servicess_TC_005.put("Step-2", " Click on Save button.");
		CLM_ANM_servicess_TC_005.put("Expected Behaviour", "The message 'Record(s) saved successfully' should be displayed with Ok button.");
		CLM_ANM_servicess_TC_006.put("Test Objective", "The objective of the test case is to check the functionality of Save button when  the mandatory fields are not entered.");
		CLM_ANM_servicess_TC_006.put("Step-1", "Don’t enter any data");
		CLM_ANM_servicess_TC_006.put("Step-2", " Click on Save button");
		CLM_ANM_servicess_TC_006.put("Expected Behaviour", "The warning message 'Select Emergency/OP-Check in No.' should be displayed with Ok button");
		CLM_ANM_servicess_TC_008.put("Test Objective", "The objective of the test case is to check the functionality of Delete button when item/procedure is selected.");
		CLM_ANM_servicess_TC_008.put("Step-1", "Fetch the OP-Check in No. of a patient");
		CLM_ANM_servicess_TC_008.put("Step-2", " Check the delete checkbox.");
		CLM_ANM_servicess_TC_008.put("Step-3", " Enter the delete Reason");
		CLM_ANM_servicess_TC_008.put("Step-4", " Click on Delete button");
		CLM_ANM_servicess_TC_0010.put("Expeccted Behaviour", " The message 'Record(s) deleted successfully' should be displayed with Ok button.");
		CLM_ANM_servicess_TC_0010.put("Test Objective", "The objective of the test case is to check the functionality of Delete button when item/procedure is  selected and remarks is not entered.");
		CLM_ANM_servicess_TC_0010.put("Step-1", "Fetch the OP-Check in No. of a patient");
		CLM_ANM_servicess_TC_0010.put("Step-2", " Check the delete checkbox.");
		CLM_ANM_servicess_TC_0010.put("Step-3", "  Don’t enter delete reason.");
		CLM_ANM_servicess_TC_0010.put("Step-4", " Click on Delete button");
		CLM_ANM_servicess_TC_0010.put("Expeccted Behaviour", "The warning message 'Please enter the reason for cancelling the Procedure' should be displayed with Ok button.");
		
		//========DischargeIntimation=====
		doNavigateTogetDischargeIntimationLinkTest.put("Step-1", "Go to clinical Recrod Select the discharge_intimation Screen");
		CLM_Discharge_Intimation_TC_4.put("Test Objective", "The Objective of this test case is to test the Functionality of  ' Save '  Button when valid details are entered.");
		CLM_Discharge_Intimation_TC_4.put("Step-1", "Ensure that all mandatory fields are filled");
		CLM_Discharge_Intimation_TC_4.put("Step-2", "Click on save");
		CLM_Discharge_Intimation_TC_4.put("Expected Behaviour", "System should display a pop up message as 'Record Saved successfully'");
		CLM_Discharge_Intimation_TC_5.put("Test Objective", "The objective of this test case is to verify the functionality of clear button");
		CLM_Discharge_Intimation_TC_5.put("Step-1", "Fetch the patient's Admission NO clicking on search icon of Admission No. field");
		CLM_Discharge_Intimation_TC_5.put("Step-2", "Click on Clear Button");
		CLM_Discharge_Intimation_TC_5.put("Expected Behaviour", "All the details should be cleared");
		//========Clicnical Record Reports======
		doNavigateToClinical_Record_Reports.put("Step-1", "Go to Clinical Record and click on Clinical Records Reports Link");
		checkTheFunctionalityOfItemMasterdata.put("Test Objective", "To check the Functionality of Item MAster Link");
		checkTheFunctionalityOfItemMasterdata.put("Step-1", "Expends the Super Speciality Patient Referrals");
		checkTheFunctionalityOfItemMasterdata.put("Step-2", "Click on Item Master data Link");
		checkTheFunctionalityOfItemMasterdata.put("Expectinf Behaviour", "Item MAster data should be Open with preview and Clear Button");
		
		checkTheFunctionalityOfprescreption_itemIssue.put("Test Objective", "To check the Functionality of prescreption VS itemIssue");
		checkTheFunctionalityOfprescreption_itemIssue.put("Step-1", "Expends the Super Speciality Patient Referrals");
		checkTheFunctionalityOfprescreption_itemIssue.put("Step-2", "Click on prescreption VS itemIssue");
		checkTheFunctionalityOfprescreption_itemIssue.put("Expectinf Behaviour", "prescreption VS itemIssue should be Open with from date,To date,IP Number prescription Number,preview and Clear Button Field");
		
		checkTheFunctionalityOfStockStatus_StationWise.put("Test Objective", "To check the Functionality of StockStatus_StationWise");
		checkTheFunctionalityOfStockStatus_StationWise.put("Step-1", "Expends the Super Speciality Patient Referrals");
		checkTheFunctionalityOfStockStatus_StationWise.put("Step-2", "Click on StockStatus_StationWise");
		checkTheFunctionalityOfStockStatus_StationWise.put("Expectinf Behaviour", "StockStatus_StationWise should be Open with Department DropDown,preview and Clear Button Field");

		checkTheFunctionalityOfExportReport.put("Test Objective", "To check the Functionality of preview Button and Export Reprt Button");
		checkTheFunctionalityOfExportReport.put("Step-1", "Expends the Super Speciality Patient Referrals");
		checkTheFunctionalityOfExportReport.put("Step-2", "Click on Zero Stock Item");
		checkTheFunctionalityOfExportReport.put("Step-3", "Select the Adminstrative Services in dropdown And Click on preview Button");
		checkTheFunctionalityOfExportReport.put("Step-4", "click on Export Button,select the value in Formate DropDown");
		checkTheFunctionalityOfExportReport.put("Expectinf Behaviour", "Report Should be open With Export,Next butoon,Previous Button,Find,Print Button and report Should be download after click on Ok Button");
		
		ChecktheFunctionalityofClearButton.put("Test Objective", "To check the Functionality of Clear Button");
		ChecktheFunctionalityofClearButton.put("Step-1", "clear Button");
		ChecktheFunctionalityofClearButton.put("Expected Behaviour", "System should clear all the data.");
		//=======FUP=========
		doNavigateToFUPTest.put("Step-1", "Go to Clinical Record and Select the FUP Screen");
		CLM_Frequently_Used_Packs_TC_04.put("Test Objective", "The objective of the test case is to check the functionality of update button of Frequently used  pack screen");
		CLM_Frequently_Used_Packs_TC_04.put("Step-1", " Enter data in all the mandatory fields of Medication/ Investigation/");
		CLM_Frequently_Used_Packs_TC_04.put("Step-2", "Click on Check Symbol");
		CLM_Frequently_Used_Packs_TC_04.put("Step-3", "Click on Update Button");
		CLM_Frequently_Used_Packs_TC_04.put("Expected Behaviour", " New should display under status column after adding Medicatin/investigation and 'Record(s) updated successfully' message should be displayed with an OK button");
		CLM_Frequently_Used_Packs_TC_05.put("Test Objective", "The objective of the test case is to check the functionality of edit link of Frequently used  pack screen");
		CLM_Frequently_Used_Packs_TC_05.put("Step-1", "Click on Investigation tab");
		CLM_Frequently_Used_Packs_TC_05.put("Step-2", "Click on edit link");
		CLM_Frequently_Used_Packs_TC_05.put("Step-3", "modify the quantity");
		CLM_Frequently_Used_Packs_TC_05.put("Step-4", "Click on right  check (√) symbol");
		CLM_Frequently_Used_Packs_TC_05.put("Step-5", "Click on Update Button");
		CLM_Frequently_Used_Packs_TC_05.put("Expected Behaviour", "Modified data should reflect under quantity column. 'updated' should be displayed under status");
		CLM_Frequently_Used_Packs_TC_07.put("Test Objective", "The objective of the test case is to check the functionality of Save button of Frequently used  pack screen without entering data in mandatory fields.");
		CLM_Frequently_Used_Packs_TC_07.put("Step-1", "Do not enter data in mandatory fields of Medication/ Investigation/ Health Interventions/Surgeries /Diagnosis");
		CLM_Frequently_Used_Packs_TC_07.put("Step-2", "Click on Save Button");
		CLM_Frequently_Used_Packs_TC_07.put("Expected Behaviour", "System should not allow user to save Record(s).");
		
		//========order pack====
		doNavigateToOrderPacksTest.put("Step-1", "Go to Clinical Record and Select the OrderPack Screen");
		CLM_Order_Packs_TC_03.put("Test Objective", "The objective of the test case is to check the functionality of Save button of Order  packs screen");
		CLM_Order_Packs_TC_03.put("Step-1", "Enter Required data in Medication/ Investigation/ Health Interventions/Surgeries /Diagnosis");
		CLM_Order_Packs_TC_03.put("Step-2", "Click on Save Button");
		CLM_Order_Packs_TC_03.put("Expected Behaviour", "Record(s) saved successfully message should be displayed' with an OK button");
		CLM_Order_Packs_TC_04.put("Test Objective", "The objective of the test case is to check the functionality of update button of Order packs screen");
		CLM_Order_Packs_TC_04.put("Step-1", " Enter data in all the mandatory fields of Medication/ Investigation/ Health Interventions/Surgeries /Diagnosis");
		CLM_Order_Packs_TC_04.put("Step-2", "Click on right check (√) symbol");
		CLM_Order_Packs_TC_04.put("Step-3", "Click on Update");
		CLM_Order_Packs_TC_04.put("Expected Behaviour", "New should display under status column after adding Medicatin/investigation/Health Intervention/Diagnosis andRecord(s) updated successfully message should be displayed with an OK button");
		CLM_Order_Packs_TC_06.put("Test Objective", "The objective of the test case is to check the functionality of delete link of Order  packs screen");
		CLM_Order_Packs_TC_06.put("Step-1", "Click on Medication/ Investigation/ Health Interventions/Surgeries /Diagnosis tab");
		CLM_Order_Packs_TC_06.put("Step-1", "Click on delete link");
		CLM_Order_Packs_TC_06.put("Expected Behaviour", "Deleted should be displayed under status");
		CLM_Order_Packs_TC_07.put("Test Objective", "The objective of the test case is to check the functionality of Save button of Order  pack screen without entering data in mandatory fields.");
		CLM_Order_Packs_TC_07.put("Step-1", " Do not enter data in mandatory fields of Medication/ Investigation/ Health Interventions/Surgeries /Diagnosis");
		CLM_Order_Packs_TC_07.put("Step-2", "Click on Save Button");
		CLM_Order_Packs_TC_07.put("Expected Behaviour", "System should not allow user to save Record(s).");
		//========Discharge Summery======
		doNavigateTogetDischargeSummaryLinkTest.put("Step-1", "Go to Clinical Record and Select the Discrage Summery Screen");
		CLM_Discharge_Summary_TC_6.put("Test Objective", "The Objective of this test case is to test the Functionality of ' Preview ' Button.");
		CLM_Discharge_Summary_TC_6.put("Step-1", "Select admission No. Select records and click on Preview button.");
		CLM_Discharge_Summary_TC_6.put("Expeccted Behaviour", "Preview of discharge summary should be shown with print and Bill Print button.");
		CLM_Discharge_Summary_TC_7.put("Test Objecctive", "The Objective of this test case is to checkthe functionality of save button without IP No.");
		CLM_Discharge_Summary_TC_7.put("Step-1", "Do not select Admission no. Click on save button.");
		CLM_Discharge_Summary_TC_7.put("expected Behaviour", "System should prompt the message 'Select Admission No.'");
		CLM_Discharge_Summary_TC_10.put("Test Objective", "The Objective of this test case is to checkthe functionality of Save button in the screen.");
		CLM_Discharge_Summary_TC_10.put("Step-1", "Select a record");
		CLM_Discharge_Summary_TC_10.put("Step-2", " Click on any of the button beside the section.");
		CLM_Discharge_Summary_TC_10.put("Step-3", "Enter some data in Discharge summary field.");
		CLM_Discharge_Summary_TC_10.put("Step-4", "Click on Done button");
		CLM_Discharge_Summary_TC_10.put("Step-5", "Click on Save button");
		CLM_Discharge_Summary_TC_10.put("Expected Behaviour", "System should prompt the message 'Record saved successfully'");
		
		//=======InpatientReferral WorkList====
		donavigatetoInpatientRefferlWorklist.put("Step-1", "Go to Clinical Record and Select the InpatientReferral WorkList Screen");
		donavigatetoInpatientRefferlWorklist.put("Step-2", "Select the data from Date Click on Admission Number");
		//======Open Visit========
		doNavigateToOpenVisitTest.put("Step-1", "Go to Clinical Record and Select the Open Visit Screen");
		CLM_Open_Visits_TC_5.put("Test Objective", "The objective of this test case is to verify the functionality of clear button");
		CLM_Open_Visits_TC_5.put("Step-1", "Clinical records -> Open Visits");
		CLM_Open_Visits_TC_5.put("Step-2", "Fetch the patient's UHID clicking on search icon Of UHID field");
		CLM_Open_Visits_TC_5.put("Step-3", "Click on Clear Button");
		CLM_Open_Visits_TC_5.put("Expected Behaviour", "All the details should be cleared");
		CLM_Open_Visits_TC_6.put("Test Objective", "The objective of this test case is to verify that whether MR can be closed or  not when clicking on Close MR Button");
		CLM_Open_Visits_TC_6.put("Step-1", "Clinical records -> Open Visits");
		CLM_Open_Visits_TC_6.put("Step-2", "Fetch the patient's UHID clicking on search icon Of UHID field");
		CLM_Open_Visits_TC_6.put("Step-3", "Click on OK Button");
		CLM_Open_Visits_TC_6.put("Step-4", "Click on Check Box for the patient whose status is open.");
		CLM_Open_Visits_TC_6.put("Step-5", "Click on Close MR");
		CLM_Open_Visits_TC_6.put("Expected Behaviour", "Status should be changed to Closed.");
		CLM_Open_Visits_TC_7.put("Test Objective", "The objective of this test case is to verify that whether MR can be again opened or  not when clicking on Open MR Button");
		CLM_Open_Visits_TC_7.put("Step-1", "Clinical records -> Open Visits");
		CLM_Open_Visits_TC_7.put("Step-2", "Fetch the patient's UHID clicking on search icon Of UHID field");
		CLM_Open_Visits_TC_7.put("Step-3", "Click on OK Button");
		CLM_Open_Visits_TC_7.put("Step-4", "Click on Check Box for the patient whose status is open.");
		CLM_Open_Visits_TC_7.put("Step-5", "Click on Close MR");
		CLM_Open_Visits_TC_7.put("Expected Behaviour", "Visits not yet closed Pop up should be displayed");
		CLM_Open_Visits_TC_8.put("Test Objective", "The objective of this test case is to verify that whether MR can be opened or  not when clicking on MR Button");
		CLM_Open_Visits_TC_8.put("Step-1", "Clinical records -> Open Visits");
		CLM_Open_Visits_TC_8.put("Step-2", "Fetch the patient's UHID clicking on search icon Of UHID field");
		CLM_Open_Visits_TC_8.put("Step-3", "Click on OK Button");
		CLM_Open_Visits_TC_8.put("Step-4", "Click on Check Box for the patient whose status is closed.");
		CLM_Open_Visits_TC_8.put("Step-5", "Click on Open MR");
		CLM_Open_Visits_TC_8.put("Expected Behaviour", "Status should be changed to opened.");
		CLM_Open_Visits_TC_9.put("Test Objective", "The objective of this test case is to verify that whether MR can be closed or  not when clicking on Close MR Button");
		CLM_Open_Visits_TC_9.put("Step-1", "Clinical records -> Open Visits");
		CLM_Open_Visits_TC_9.put("Step-2", "Fetch the patient's UHID clicking on search icon Of UHID field");
		CLM_Open_Visits_TC_9.put("Step-3", "Click on OK Button");
		CLM_Open_Visits_TC_9.put("Step-4", "Click on Check Box for the patient whose status is closed.");
		CLM_Open_Visits_TC_9.put("Step-5", "Click on Close MR");
		CLM_Open_Visits_TC_9.put("Expected Behaviour", "Visits not yet opened Pop up should be displayed");
		
		
		
		
		
		
		//======DosageType========
		doNavigateToDosageType.put("Step-1", "Go Clinical Record and select the Dosage Type Screen");
		CLM_Dosage_Types_TC_4.put("Test Object", "The objective of this test case is to verify the functionality of Save button");
		CLM_Dosage_Types_TC_4.put("Step-1", "Enter valid data in Dosage Type Text Box");
		CLM_Dosage_Types_TC_4.put("Step-2", "click on Save Button");
		CLM_Dosage_Types_TC_4.put("Expected Behaviour", "System should display a pop up message as Data saved sucessfully");
		CLM_Dosage_Types_TC_6.put("Test Objective", "The objective of this test case is to verify the functionality of update button");
		CLM_Dosage_Types_TC_6.put("Step-1", "Fetch the dosage type clicking on search icon Dosage Types");
		CLM_Dosage_Types_TC_6.put("Step-2", "Make some changes & Click on update Button");
		CLM_Dosage_Types_TC_6.put("Expected Behaviour", "System should display a pop up message as Data modified sucessfully");
		
		
		
		//======Edit Certificate=======
		doNavigateToEditCertificateTest.put("Step-1", "Go to clinical Record And Select the Edit Certificate");
		CheckTheFunctionalityOfRequestForChangedUPdateButton.put("Step-1", "Select the data from by IP number and Enter the Data");
		CheckTheFunctionalityOfRequestForChangedUPdateButton.put("Step-2", "Click on Update Button");
		ChecktheFunctionalityOftoNavigateToEditMeternityCertificatePages.put("Step-1", "Go to clinical Record And Select the Edit Certificate");
		ChecktheFunctionalityOfUpdateButtonOfEditMeternityCertificatePages.put("Step-1", "Select the data from by IP number and Enter the Data");
		ChecktheFunctionalityOfUpdateButtonOfEditMeternityCertificatePages.put("Step-2", "Click on Update Button");
		//==========Laboratory======
		donavigatetoworklaboratory.put("Step-1", "Go to Laboratory And Select the Laboratory Worklist ");
		donavigatetoworklaboratory.put("Step-2", "Click on Req Number ");
		donavigatetoworklaboratory.put("Step-3", "Select the SC Check box And Click on Save Button");
		donavigatetoworklaboratory.put("Step-4", "Select The SA Check box and Click on Save Button");
		donavigatetoworklaboratory.put("Step-5", "Go to Sample Acknowlage Screen Select the REq Number By IP Number Click on Acknowladge Button");
		//===========inaptient WorkList====
		doNavigatetoIPCaseshetForLab.put("Step-1", "Go to Clinical Record And Select the Case Sheet");
		doNavigatetoIPCaseshetForLab.put("Step-2", "Select the Orderpack in Case Sheet And click on Save Button");
		doNavigatetoChangeLocation.put("Step-1", "Click on Change Location Link");
		doNavigatetoChangeLocation.put("Step-2", "Select the Location And Facility");
		doNavigatetoChangeLocation.put("Step-3", "Go Laboratory And Select the Lab Worklist");
		doNavigateToTestCaseForLabWorkListInpatient.put("Step-1", "Click on Req Number ");
		doNavigateToTestCaseForLabWorkListInpatient.put("Step-2", "Select the SC Check box And Click on Save Button");
		doNavigateToTestCaseForLabWorkListInpatient.put("Step-3", "Select The SA Check box and Click on Save Button");
		//============Test Result Entry=====
		DoTestforTestresultEntry.put("Step-1", "Go to Laboratory And Select the Test Result Entry");
		DoTestforTestresultEntry.put("Step-2", "Select the Req Number By Date");
		DoTestforTestresultEntry.put("Step-3", "Enter the data And Select the Doctor");
		DoTestforTestresultEntry.put("Step-4", "Click on Preview Button");
		//============BulkResultEntry===
		DonavigatetoBulkResultEntry.put("Step-1","Select Location and Facility");
		DonavigatetoBulkResultEntry.put("Step-2","Go to Laboratory Selct the Bulk Result Entry");
		DonavigatetoBulkResultEntry.put("Step-3", "Select the Data By Selected Data");
		DonavigatetoBulkResultEntry.put("Step-4", "Enter the data and Click on Save Button");
		//============BulkResultverification====
		changeHospitalLocationForBulkResultverificationTest.put("Step-1", "Go to Laboratory And select the BulkResultverification Screen ");	
		changeHospitalLocationForBulkResultverificationTest.put("Step-2", "Select the dat by Date and Click on Verify Button");
		changeHospitalLocationForBulkResultverificationTest.put("Step-3", "Click on clear Button");
		//========DispatchReportInpatient====
		TestCasefordDispatchReportInpatient.put("Step-1","Go to Laboratory and Select the Dispath report Inpatint Screen");
		TestCasefordDispatchReportInpatient.put("Step-2", "select the data by using Ward");
		TestCasefordDispatchReportInpatient.put("Step-3", "Click on Dispatch Button");
		changeHospitalLocationforgroup_printing_InpatientTest.put("Step-1", "Select the Location And Facility");
		changeHospitalLocationforgroup_printing_InpatientTest.put("Step-2", "go to laboratory and select the group Print Screen");
		changeHospitalLocationforgroup_printing_InpatientTest.put("Step-3", "Select the data by IP number");
		changeHospitalLocationforgroup_printing_InpatientTest.put("Step-4", "Click on Verify Button");
		changeHospitalLocationforgroup_printing_InpatientTest.put("Step-4", "Click on Clear Button");
		//========Prescription==============
		donavigateTolaboratoryPrescriptionTest.put("Step-1", "go to laboratory Select the prescription");
		donavigateTolaboratoryPrescriptionTest.put("Step-2", "Selct the IP number and Enter the the DoctorName");
		donavigateTolaboratoryPrescriptionTest.put("Step-3", "Enter the Investigation and Sample ");
		donavigateTolaboratoryPrescriptionTest.put("Step-3", "Click on ave Button");
		//======Imaging Services outpatient===========
		doNavigateToImagingWorklistLinkTest.put("Step-1", "Go to Imaging And Select the imaging WorkList");
		doImagingWorklistOPFlowTest.put("Step-1", "Selct the ReQuest Number By UHID");
		doImagingWorklistOPFlowPATest.put("Step-1", "Click on PA CheckBox And Click on save Button");
		doImagingWorklistOPFlowTestPerfTest.put("Step-1", "Click on PA CheckBox Click on Save Button");
		doImagingWorklistOPFlowResultEntryTest.put("Step-1", "Click on Result Entry Image");
		doImagingWorklistOPFlowResultEntryTest.put("Step-2", "Enter the Mandatory Field Click on Save Button");
		doImagingWorklistOPFlowResultverifyTest.put("Step-1", "Select the verify CheckBox And Click on Update Button");
		doImagingWorklistOPFlowDispatchTest.put("Step-1", "Click on Result Dispatch Image button ");
		doImagingWorklistOPFlowDispatchTest.put("Step-2", "Enter the data in DispatchTo Field");
		doImagingWorklistOPFlowDispatchTest.put("Step-3", "Click on Dispatch To Button");
		//======Imaging Services inpatient===========
		doImagingWorklistIPFlowTest.put("Step-1", "Selct the ReQuest Number By UHID");
		doImagingWorklistIPFlowPATest.put("Step-1", "Click on PA CheckBox And Click on save Button");
		doImagingWorklistIPFlowTestPerfTest.put("Step-1", "Click on PA CheckBox Click on Save Button");
		doImagingWorklistIPFlowResultEntryTest.put("Step-1", "Click on Result Entry Image");
		doImagingWorklistIPFlowResultEntryTest.put("Step-2", "Enter the Mandatory Field Click on Save Button");
		//======OPD Flow=========
		doNavigateToPatientCheckinLinkTest.put("Step-1", "Go to Registration And Select the Patient Check In");
		doCreateCheckInPageTest.put("Step-1", "Selct the Ip Number And Click on Ok Button ");
		doCreateCheckInPageTest.put("Step-2", "Click on Save Button");
		dodoctorworklist.put("Step-1", "Go to Clinical Record And Select the Doctor WorkList");
		dodoctorworklist.put("Step-2", "Selct the CaseSheet By Check-IN number");
		dodoctorworklist.put("Step-3", "Click on Prescription And Select the OrderPAck(Automation OrderPack) Click on Save Button  ");
		dodoctorworklist.put("Step-4", "Click on Change Location Facility");
		doNavigateToHISHomeTestforfacilityStore.put("Step-1", "Select the Facility and Location(Store Service)");
		dofacilityStore.put("Step-1", "Select the Check-in And Provide the Pharmacy and Click on Ok Button ");
		doNavigateToHISHomeTestforLaboratoryworklist.put("Step-1", "Select the Location and Facility(Laboratory)");
		testcaseforLaboratoryworkListOPD.put("Step-1", "Go to Laboratory and Select the Lab WorkList");
		testcaseforLaboratoryworkListOPD.put("Step-2", "Select the Req Number Click on SC CheckBox Click on Save Button");
		testcaseforLaboratoryworkListOPD.put("Step-3", "Select the Req Number Click on SA CheckBox Click on Save Button");
		testcaseforLaboratoryworkListOPD.put("Step-4", "click on Result entry image button and enter the data");
		testcaseforLaboratoryworkListOPD.put("Step-5", "Click on Save Button");
		testcaseforLaboratoryworkListOPD.put("Step-6", "click on Result entry image button and click on verify checkBox");
		testcaseforLaboratoryworkListOPD.put("Step-7", "Click on Update Button");
		testcaseforLaboratoryworkListOPD.put("Step-8", "Click on Result Dispatch image Button enter the data");
		testcaseforLaboratoryworkListOPD.put("Step-9", "Click on save Button");
		
		
		doNavigateToHISHomeTestforImagingServices.put("Step-1", "Select the Location And Facility(Imagging Services)");
		doImagingServices.put("Step-1", "Go to Imagging And Select the WorkList");
		doImagingServices.put("Step-2", "Select The Req Number And Click On PA Check Box And Click on Save Button");
		doImagingServices.put("Step-3", "Select The Req Number And Click On TP Check Box And Click on Save Button");
		doImagingServices.put("Step-3", "click on ResultEntry Image Button Enter the test Data Click on Save Button");
		doImagingServices.put("Step-4", "Select the Result verify checkBox,Select the Doctor and click on Update Button");
		doImagingServices.put("Step-5", "Click on Result Dispatch Image Button Enter the test Data Click on Save Button");
		
		//===========IPD Flow======
		
		dotestcaseIPDFlowPagepatientAddmission.put("Step-1", "Select the data by IP Number(1100000034)");
		dotestcaseIPDFlowPagepatientAddmission.put("Step-2", "Select Specialization and Ward");
		dotestcaseIPDFlowPagepatientAddmission.put("Step-3", "Click on Save Button");
		
		dotestcaseIPDFlowPagepatientInpatientmanagement.put("Step-1", "Select the Male Medical Ward And Go Allot Bed Screen ");
		dotestcaseIPDFlowPagepatientInpatientmanagement.put("Step-2", "Select the Bed And Click on Save Button");
		dotestcaseIPDFlowPagepatientInpatientmanagement.put("Step-3", "Go to Update Bed Screen And Select the Bed click on Save Button ");
		dotestcaseIPDFlowPagepatientIPcasesheetPrecription.put("Step-1", "Select the Adminstrative Services Facility");
		dotestcaseIPDFlowPagepatientIPcasesheetPrecription.put("Step-2", "Go to Clinical Record And Select the CaseSheet");
		dotestcaseIPDFlowPagepatientIPcasesheetPrecription.put("Step-3", "Click on Prescription And Selec the OrderPack Click on Save Button");
		testcaseforInpatientIssues.put("Step-1", "Select the Male Medical Ward And Go to Store and Select the Inpatient Issues");
		testcaseforInpatientIssues.put("Step-2", "Select the Admission and Issues the Medicine and Click on Save Button");
		testcaseforLaboratory.put("Step-1", "Select the Laboratory Facility And Go Laboratory and Select the LabWorkList");
		testcaseforLaboratory.put("Step-2", "Click on Req Number And Select the SC CheckBox and Click on Save Button");
		testcaseforLaboratory.put("Step-3", "Click on Req Number And Select the SA CheckBox and Click on Save Button");
		TestcaseforImaggingServices.put("Step-1", "Select the Imagging Services Facility the Go to Imagging ANd select the Imagging WorkList");
		TestcaseforImaggingServices.put("Step-2", "Search the Req Number by Admission Number and Click on Req Number");
		TestcaseforImaggingServices.put("Step-3", "Select the PA CheckBox And Click on Save Button");
		TestcaseforImaggingServices.put("Step-3", "Select the TP CheckBox And Click on Save Button");
		TestcaseforDischageIntimation.put("Step-1", "Selct the Adminastrative Services Facility Then Go Clinical Record and Select the Discharge Intemation");
		TestcaseforDischageIntimation.put("Step-2", "Select the Patient By admission Number Select the Request And Click on Save Button");
		TestcaseforDischageIntimation.put("Step-3", "Change the Facility to Male Medical Record And Go to Discharge Intemation Screen");
		TestcaseforDischageIntimation.put("Step-4", "click on Intemation then Click on Save Button");
		//=======death Record=========
		testcaseforDeathRecrd.put("Step-1", "Go to Medical Record And Select Death Record");
		testcaseforDeathRecrd.put("Step-2", "Select the Patient by Admission Number Enter the Mandatory Field");
		testcaseforDeathRecrd.put("Step-3", "Click on Save Button");
		changeHospitalLocationTest.put("Step-1", "Select the Location and Facility(Medical Record Departmant)");
		testcaseforbirthRegistration.put("Step-2", "Select the Patient by Admission Number Enter the Mandatory Field");
		testcaseforbirthRegistration.put("Step-3", "Click on Save Button");
		//=========Store(Physical Stock Entry)=======
		doNavigateToPhysicalStockEntryLink.put("Step-1","Go to Store And Select the Physical Stock Entry");
		TC_Store_Physical_Stock_Entry_004.put("Test Objctive","The objective of the test case is to validate that user should be able to Enter Item");
		TC_Store_Physical_Stock_Entry_004.put("Step-1", "Click on Physical Stock Entry screen > Search Item > Enter Item name > Search");
		TC_Store_Physical_Stock_Entry_004.put("Expected Behaviour", "All the related record should get display for searched item");
		TC_Store_Physical_Stock_Entry_005.put("Test Objective", "The objective of the test case is to validate that user should be able to Select the Item name from the list");
		TC_Store_Physical_Stock_Entry_005.put("Step-1", " Click on Physical Stock Entry screen > Search Item > Enter Item name > Search > Select any item ");
		TC_Store_Physical_Stock_Entry_005.put("Expected Behaviour", "Selected record should get added in Physical Stock Entry screen");
		TC_Store_Physical_Stock_Entry_006.put("Test Objective", "The objective of the test case is to validate that user should be able to Save the record");
		TC_Store_Physical_Stock_Entry_006.put("Step-1", "Click on Physical Stock Entry screen > Search Item > Enter Item name > Search > Select any item > Save");
		TC_Store_Physical_Stock_Entry_006.put("Expected Behaviour", "A success message ' Record(s) Saved Successfully' with Ok button");
		TC_Store_Physical_Stock_Entry_007.put("Test Objective", "The objective of the test case is to validate that user should be able to Print the Saved record");
		TC_Store_Physical_Stock_Entry_007.put("Step-1", "Save the records > Click on print button");
		TC_Store_Physical_Stock_Entry_007.put("Expected Behaviour", "Print report should get generated with Physical Stock Entry Title and Item details");
		TC_Store_Physical_Stock_Entry_008.put("test objective", "The objective of the test case is to validate that user should be able to Clear the Saved record");
		TC_Store_Physical_Stock_Entry_008.put("Step-1", "Click on Clear button ");
		TC_Store_Physical_Stock_Entry_008.put("Expected Behaviour", "Saved record should get clear from the Physical Stock Entry screen");
		TC_Store_Physical_Stock_Entry_012.put("Test Objective", "The objective of the test case is to fetch the Saved Entry from Entry No. search button");
		TC_Store_Physical_Stock_Entry_012.put("Step-1", " Click on Entry No. Search > Select any Entry No.. ");
		TC_Store_Physical_Stock_Entry_012.put("Step-2", " Click on Select Button ");
		TC_Store_Physical_Stock_Entry_012.put("Expected Behaviour", "It should navigate user to Physical Stock Entry Selected Item detail screen with Clear and Print button options");
		//========Alter Mrp=====
		doNavigateAlterMRPLinkTest.put("Step-1","Go to Store And Select the Alter MRP");
		TC_Alter_MRP_004.put("Test Objective","The objective of the test case is to validate that user should be able to enter and Save new MRP");
		TC_Alter_MRP_004.put("Step-1", "Click on Item search button >Enter Item name > Select any");
		TC_Alter_MRP_004.put("Step-2", "Click on Item search button >Enter Item name > Select any");
		TC_Alter_MRP_004.put("Step-3", "Click on Batch no. search > Check Batch no. > Enter new MRP > Save");
		TC_Alter_MRP_004.put("Expected Behaviour", " New MRP updated successfully message should display");
		TC_Alter_MRP_005.put("Test Objective", "The objective of the test case is to validate that user should be able to fetch the newly entered MRP");
		TC_Alter_MRP_005.put("Step-1", "Click on Item search button >Enter Item name > Select recently updated item from the list");
		TC_Alter_MRP_005.put("Step-2", "Click on Batch no. search > Check same Batch no");
		TC_Alter_MRP_005.put("Expected Behaviour", "Recently updated MRP should display in Old MRP and new MRP edit field should display");
		TC_Alter_MRP_007.put("Test Objective", "The objective of the test case is to validate that user should be able to clear data from Alter MRP window");
		TC_Alter_MRP_007.put("Step-1", "Click on clear button");
		TC_Alter_MRP_007.put("expected Behaviour", "All the entered data should get removed");
		
		//=======Adujustment=======
		doNavigateAdjustmentLinkTest.put("Step-1","Go to Store And Select the Adujustment Screen");
		TC_Store_Adjustment_004.put("Test Objective","The objective of the test case is to validate that user should be able to Search Adjustment ");
		TC_Store_Adjustment_004.put("Step-1", " Click on Item search > Enter item name > Search");
		TC_Store_Adjustment_004.put("Expected Behaviour", "All the related record should get diplay for searched item");
		TC_Store_Adjustment_005.put("test Objective", "The objective of the test case is to validate that user should be able to Select Item");
		TC_Store_Adjustment_005.put("Step-1", " Click on Item search > Enter item name > Search");
		TC_Store_Adjustment_005.put("Step-2", "Select any Item from the list > Ok");
		TC_Store_Adjustment_005.put("Expected Behaviour", "Selected record should get added in Adjustment screen");
		TC_Store_Adjustment_006.put("Test Objective", "The objective of the test case is to validate that user should be able to save record after selecting batch no.");
		TC_Store_Adjustment_006.put("Step-1", "Click on Item search > Enter item name > Search");
		TC_Store_Adjustment_006.put("Step-2", "Select any Item from the list > Ok > Click on Batch no.");
		TC_Store_Adjustment_006.put("Step-3", "Select any batch no. > Enter Quantity > Enter remark > Save");
		TC_Store_Adjustment_006.put("Expected Behaviour", "'A success message \"Record(s) Saved Successfully\" should display with Ok button");
		TC_Store_Adjustment_008.put("Test Objective", "The Objective of the testcase is to check the functionality of Save button when Expiry item is selected");
		TC_Store_Adjustment_008.put("Step-1", " Click on Adjustment screen > Enter Refrence no. ");
		TC_Store_Adjustment_008.put("Step-2", " Select Item which is near to its expiry date > Save");
		TC_Store_Adjustment_008.put("Expeccted Behaviour", "A message The Items which is going to expiry first will be issued");
		TC_Store_Adjustment_009.put("Test Objective", "The Objective of the testcase is to check the functionality of Clear button when records are generated");
		TC_Store_Adjustment_009.put("Step-1", "Select Item > Fill all required fill > Save > Click on Clear button");
		TC_Store_Adjustment_009.put("Expected Behaviour", "All the record should get cleared normally from Adjustment screen");
		TC_Store_Adjustment_010.put("Test Objective", "The Objective of the testcase is to View the saved Adjustment records");
		TC_Store_Adjustment_010.put("Step-1", "Click on Adjustment no. > Select FromDate and ToDate > Select saved record > Ok");
		TC_Store_Adjustment_010.put("Expectd Behaviour", "User should be navigated to Adjustment screen with Clear/ Approve/Reject buttons");
		TC_Store_Adjustment_011.put("Test Objective", "The Objective of the testcase is to Approve the saved Adjustment records");
		TC_Store_Adjustment_011.put("Step-1", "Click on Adjustment no. > Select FromDate and ToDate > Select saved record > Ok");
		TC_Store_Adjustment_011.put("Step-2", "Click on Approve button");
		TC_Store_Adjustment_011.put("Expected Behaviour", "A success message 'Approved Successfully ' should display with Ok button");
		TC_Store_Adjustment_012.put("Test-Objective", "The Objective of the testcase is to Reject saved Adjustment records");
		TC_Store_Adjustment_012.put("Step-1", " Click on Adjustment no. > Select FromDate and ToDate > Select saved record > Ok");
		TC_Store_Adjustment_012.put("Step-2", "Click on Reject button ");
		TC_Store_Adjustment_012.put("Expected BEhaviour", "A success message 'Rejected Successfully' should display with Ok button");
		
		//=====Store Consumtion======
		doNavigateStoreConsumptionTest.put("Step-1","Go to Store And Select the StoreConsumption Screen");
		TC_Store_Consumption_004.put("Test Objective","The objective of the test case is to validate that user should be able to Search Item ");
		TC_Store_Consumption_004.put("Step-1", "Click on Store Consumption screen > Enter Refrence no. ");
		TC_Store_Consumption_004.put("Step-2", "Click on Item search > Enter item name > Search");
		TC_Store_Consumption_004.put("Expected Behaviour", "All the related record should get diplay for searched item");
		TC_Store_Consumption_005.put("Test Objective", "The objective of the test case is to validate that user should be able to Select Item");
		TC_Store_Consumption_005.put("Step-1", "Click on Item search > Enter item name > Search");
		TC_Store_Consumption_005.put("Step-2", "Select any Item from the list > Ok");
		TC_Store_Consumption_005.put("Expected Behaviour", "Selected record should get added in StoreConsumption screen");
		TC_Store_Consumption_006.put("Test Objective", "The objective of the test case is to validate that user should be able to save record after selecting  batch no.");
		TC_Store_Consumption_006.put("Step-1", "Select any Item from the list > Ok > Click on Batch no.");
		TC_Store_Consumption_006.put("Step-2", "Select any batch no. > Enter Quantity > Enter remark > Save");
		TC_Store_Consumption_006.put("Expected Behaviour", "'A success message \"Record(s) Saved Successfully\" should display with Ok button");
		TC_Store_Consumption_009.put("Test Objective", "The Objective of the testcase is to check the functionality of Clear button when records are generated");
		TC_Store_Consumption_009.put("Step-1", "Select Item > Fill all required fill > Save > Click on Clear button");
		TC_Store_Consumption_009.put("Expected Behaviour", "All the record should get cleared normally from StoreConsumption screen");
		TC_Store_Consumption_010.put("Test Objective", "The Objective of the testcase is to View the saved  StoreConsumption records");
		TC_Store_Consumption_010.put("Step-1", "Click on StoreConsumption no. > Select FromDate and ToDate > Select saved record > Ok");
		TC_Store_Consumption_010.put("Step-2", "Click on Approve button");
		TC_Store_Consumption_010.put("Expected Behaviour", "User should be navigated to Loss and Breakage screen with Clear/ Approve/Reject buttons");
		TC_Store_Consumption_011.put("Test Objective", "The Objective of the testcase is to Approve the saved  Loss and Breakage StoreConsumption records");
		TC_Store_Consumption_011.put("Step-1", "Click on Approve button ");
		TC_Store_Consumption_011.put("expected Behaviour", "A success message Approved Successfully  should display with Ok button");
		TC_Store_Consumption_012.put("Test Objective", "The Objective of the testcase is to Reject saved  Store and Consumption records");
		TC_Store_Consumption_012.put("Step-1", "Click on LB no. > Select FromDate and ToDate > Select saved record > Ok");
		TC_Store_Consumption_012.put("Step-2", "Click on Reject button");
		TC_Store_Consumption_012.put("Expected Behaviour", "A success message 'Rejected Successfully' should display with Ok button");
		//======Loss and Breakage====
		doNavigateLossBreakageLinkTest.put("Step-1","Go to Store And Select the LossBreakage Screen");
		TC_Store_Loss_and_Breakage_004.put("Test Objective","The objective of the test case is to validate that user should be able to Search Item ");
		TC_Store_Loss_and_Breakage_004.put("Step-1", "Click on Loss and Breakage screen > Enter Refrence no. ");
		TC_Store_Loss_and_Breakage_004.put("Step-2", "Click on Item search > Enter item name > Search");
		TC_Store_Loss_and_Breakage_004.put("Expected Behaviour", "All the related record should get diplay for searched item");
		TC_Store_Loss_and_Breakage_005.put("Test Objective", "The objective of the test case is to validate that user should be able to Select Item");
		TC_Store_Loss_and_Breakage_005.put("Step-1", "Click on Item search > Enter item name > Search");
		TC_Store_Loss_and_Breakage_005.put("Step-2", "Select any Item from the list > Ok");
		TC_Store_Loss_and_Breakage_005.put("Expected Behaviour", "Selected record should get added in Loss and Breakage screen");
		TC_Store_Loss_and_Breakage_006.put("Test Objective", "The objective of the test case is to validate that user should be able to save record after selecting  batch no.");
		TC_Store_Loss_and_Breakage_006.put("Step-1", "Select any Item from the list > Ok > Click on Batch no.");
		TC_Store_Loss_and_Breakage_006.put("Step-2", "Select any batch no. > Enter Quantity > Enter remark > Save");
		TC_Store_Loss_and_Breakage_006.put("Expected Behaviour", "'A success message \"Record(s) Saved Successfully\" should display with Ok button");
		TC_Store_Loss_and_Breakage_009.put("Test Objective", "The Objective of the testcase is to check the functionality of Clear button when records are generated");
		TC_Store_Loss_and_Breakage_009.put("Step-1", "Select Item > Fill all required fill > Save > Click on Clear button");
		TC_Store_Loss_and_Breakage_009.put("Expected Behaviour", "All the record should get cleared normally from Loss and Breakage screen");
		TC_Store_Loss_and_Breakage_010.put("Test Objective", "The Objective of the testcase is to View the saved  Loss and Breakage records");
		TC_Store_Loss_and_Breakage_010.put("Step-1", "Click on LB no. > Select FromDate and ToDate > Select saved record > Ok");
		TC_Store_Loss_and_Breakage_010.put("Step-2", "Click on Approve button");
		TC_Store_Loss_and_Breakage_010.put("Expected Behaviour", "User should be navigated to Loss and Breakage screen with Clear/ Approve/Reject buttons");
		TC_Store_Loss_and_Breakage_011.put("Test Objective", "The Objective of the testcase is to Approve the saved  Loss and Breakage records");
		TC_Store_Loss_and_Breakage_011.put("Step-1", "Click on Approve button ");
		TC_Store_Loss_and_Breakage_011.put("expected Behaviour", "A success message Approved Successfully  should display with Ok button");
		TC_Store_Loss_and_Breakage_012.put("Test Objective", "The Objective of the testcase is to Reject saved  Loss and Breakage records");
		TC_Store_Loss_and_Breakage_012.put("Step-1", "Click on LB no. > Select FromDate and ToDate > Select saved record > Ok");
		TC_Store_Loss_and_Breakage_012.put("Step-2", "Click on Reject button");
		TC_Store_Loss_and_Breakage_012.put("Expected Behaviour", "A success message 'Rejected Successfully' should display with Ok button");
		//======DownloadCRCItem=======
		donavigateToDownloadCRCItemTest.put("Step-1","Go to Store And Select the DownloadCRCItem Screen");
		doTestForDownloadCRCItemListTest.put("Step-1", "Select the Allopathy in Category and Select the All in ActiveRateContect");
		doTestForDownloadCRCItemListTest.put("Step-2", "Click on DownLoad Button");
		//=======indent order=========
		doNavigateIndentOrderLinkTest.put("Step-1","Go to Store And Select the Indent Order Screen");
		doIndentOrderTest.put("Step-1", "Select the Store c Indent_to Field");
		doIndentOrderTest.put("Step-2", "Select the Item Peracetamol 500 mg and Enter the Quantity");
		doIndentOrderTest.put("Step-3", "Click on Save Button");
		//=======indent Worklist=====
		doIndentWorklistViewIndentApproveFromStoreTest.put("Step-1", "Get the Indent Number From Indent Order Screen");
		doIndentWorklistViewIndentApproveFromStoreTest.put("Step-2", "Go Store and Select the indent WorkList");
		doIndentWorklistViewIndentApproveFromStoreTest.put("Step-3", "Select the Indent And Click on Approve Button");
		doIndentWorklistViewIndentApproveFromStoreTest.put("Step-4","click on Change Location Facility");
		doIndentWorklistViewIndentApproveToStoreTest.put("Step-1", "Change Facility Store C to Store D");
		doIndentWorklistViewIndentApproveToStoreTest.put("Step-2", "Go to Store And Select the Indent workList");
		doIndentWorklistViewIndentApproveToStoreTest.put("Step-3", "Select the Indent And Click on View Indent");
		doIndentWorklistViewIndentApproveToStoreTest.put("Step-4", "Click on Approve Button");
		//=====inpatient management(ward bed Status)======
		WardBedStatus.put("Step-1", "Go to Inpatient management and select the Ward Bed Status");
		WardBedStatus.put("Step-2", "Select the Icon in View DropDown Field");
		//========wardDeshboard=========
		WardDashBoard.put("Step-1", "Go to Inpatient management and select the Ward_DeshBord ");
		WardDashBoard.put("Step-2", "click the Icon then click on admission Number and click on Back Button ");
		//========patient Discharge=====
		PatientDischarge.put("Step-1", "Go to Inpatient management and select the Ward DeshBord Status");
		PatientDischarge.put("Step-2", "Selecct the patient by admission Number");
		PatientDischarge.put("Step-3", "Select the Request and Enter the Remarks ");
		PatientDischarge.put("Step-4", "Click on Save Button");
		//======prmery Doctor Changed===
		PrimaryDoctorChange.put("Step-1", "Go to Inpatient management and select the primery Doctor Changed");
		PrimaryDoctorChange.put("Step-2", "Select he Patinet by Admission Number");
		PrimaryDoctorChange.put("Step-3", "Change the Doctor");
		PrimaryDoctorChange.put("Step-4", "Click on Save Button");
		//======Nurse Task=======
		NurseTasks.put("Step-1", "Go to Inpatient management and select the Nurse Task Screen");
		NurseTasks.put("Step-2", "Select he Patinet by Admission Number");
		NurseTasks.put("Step-3", "Enter the Mandatory Field And Click on Save Button");
		//=====Bed side Procedure=====
		BedsideProceduresOrder.put("Step-1", "Go to Inpatient management and select the BedSide Procedure Screen");
		BedsideProceduresOrder.put("Step-2", "Select he Patinet by Name");
		BedsideProceduresOrder.put("Step-3", "Select the Procedure By Procedure Name");
		BedsideProceduresOrder.put("Step-4", "Click on Save Button");
		//======specialtyprocedurerequest=====
		specialtyprocedurerequest.put("Step-1", "Go to Inpatient management and select the Specialty Procedure Rerequest Screen");
		specialtyprocedurerequest.put("Step-2", "Select the Patient By bed Name ");
		specialtyprocedurerequest.put("Step-3", "Select the Procedure By Name");
		specialtyprocedurerequest.put("Step-4", "Click on Save Button");
		//=======progress Notes====
		ProgressNotes.put("Step-1", "Go to Inpatient management and select the Progress Note Screen");
		ProgressNotes.put("Step-2", "select the Patient by name ");
		ProgressNotes.put("Step-3", "Enter the Mandatory Field ");
        ProgressNotes.put("Step-4", "click on Save Button");	
        //========Vital Entry===
        VitalsEntry.put("Step-1", "Go to Inpatient management and select the Progress Note Screen");
        VitalsEntry.put("Step-2", "Select the patient From By admission Number");
        VitalsEntry.put("Step-3", "Enter the Mandatory Field ");
		VitalsEntry.put("Step-4", "Click on Save Button");
		//=====Intake Output Entry====
		IntakeOutputEntry.put("Step-1", "Go to Inpatient management and select the Intake OutEntry Screen");
		IntakeOutputEntry.put("Step-2", "Select the Patient by Admission Number");
		IntakeOutputEntry.put("Step-3", "Select the Juice In Intake Entry and Enter the Quantity");
		IntakeOutputEntry.put("Step-4", "Click on Save Button");
		IntakeOutputEntry.put("Step-5", "Click on Output Entry Radio button");
		IntakeOutputEntry.put("Step-6", "Select the vomit in Output Entry and Enter the Quantity");
		IntakeOutputEntry.put("Step-4", "Click on Save Button");
		//=====Ward Unit====
		WardUnit.put("Step-1", "Go to Inpatient management and select the Ward Unit Screen");
		WardUnit.put("Step-2", "Enter the Mandatory Field And Click on ModyFy Button");
		//======bed Transfer=======
		Transferbed.put("Step-1", "Go to Inpatient management and select the Bed Transfer Request");
		Transferbed.put("Step-2", "Select the Patient By Admission Number");
		Transferbed.put("Step-3", "Select the Ward from Ward DropDown List");
		Transferbed.put("Step-4", "Select The Bed From Bed DropDown List");
		Transferbed.put("Step-5", "Click on Transfer Button");
		//======InvestigationRequest
		InvestigationRequest.put("Step-1", "Go to Inpatient management and select the Investigation Request Screen");
		InvestigationRequest.put("Step-2", "Select the Patient by IP number");
		InvestigationRequest.put("Step-3", "Select the test");
		InvestigationRequest.put("Step-4", "click on Save Button");
		//=======TranferRequestofWard====
		TranferRequestofWard.put("Step-1", "Go to Inpatient management and select the Tranfer Requestof Ward Screen");
		TranferRequestofWard.put("Step-2", "Select the patient by Admission Number");
		TranferRequestofWard.put("Step-3", "");
		TranferRequestofWard.put("Step-4", "");
		//========OT Resourse And Schduling(View Ot List)======
		doNavigateTopatientCheck_in_Link.put("Step-1", "Go to Registration and Select the Patient Check_IN Page");
		doTestForcreatePatientCheck_IN.put("Step-1", "Select the patient By IP number Click On save Button");
		dotestforOT_PAC.put("Step-1", "Go to Doctor Worklist Screen click on Patient CaseSheet");
		dotestforOT_PAC.put("Step-2", "Enter the Surgery then Fill Mandatory Field and clik on Save Button");
		dotestforOT_PAC.put("Step-3", "Go to OTandResourceSchedulingLink and Select the ViewOTList Screen");
		dotestforOT_PAC.put("Step-4", "click on Req Number and Enter the Temprature and Health Status");
		dotestforOT_PAC.put("Step-5", "click on Save Button");
		//======OT Resourse And Schduling(Surgery Record)====
		doNavigateToOTandResourceSchedulingTest.put("Step-1", "Go to OTandResourceSchedulingLink and Select the ViewOTList Screen");
		doOTandResourceSchedulingnTest.put("Step-2", "Click on Req Number and select the Surgery Record");
		doOTandResourceSchedulingnTest.put("Step-3", "Fill The all Mandatory Field Click on Save Button");
		//======OT Resourse And Schduling(oprative Notes)=====
		doNavigateToOTandResourceSchedulingTest.put("Step-1", "Go to OTandResourceSchedulingLink and Select the Operative/OT notes Screen");
		dotestcaseforotoperativeotnotesLink.put("Step-1","Search the Patient By Order Number ");
		doNavigateToOTandResourceSchedulingTest.put("Step-2", "Selct the Notes from Notes DropDown List");
		doNavigateToOTandResourceSchedulingTest.put("Step-3", "Fill The All Mandatory Field Click on Save Button");
		//======OT Resourse And Schduling(priscription)=====
		doNavigateToOTPrescriptionLink.put("Step-1", "Go to OTandResourceSchedulingLink and Select the priscription Screen");
		donavigateTotestcaseOTprescription.put("Step-1", "Select the Patient by IP Number");
		donavigateTotestcaseOTprescription.put("Step-2","Entert the mandatory Field and Click on Save Button");
		
		//=====AV (Doctor worklist)
		
		doNavigateToDrWorkList.put("Step-1", "go to doctorworklist");
		
		//=====AV (Video consultation)
		
		donavigatetoVideoConsultationpage.put("Step-1", "click on video consultation hyperlink");
		donavigatetoVideoConsultationpage.put("Step-2", "click on video consultation check-in number");
		donavigatetoVideoConsultationpage.put("Step-3", "click on video consultation meeting link");
		
		
		//====AV (Chief complaint)

		CheckFunctionalityOfChiefComplants.put("Step-1", "search chief complaint");
		CheckFunctionalityOfChiefComplants.put("Step-2", "Select chief complaint");
		CheckFunctionalityOfChiefComplants.put("Step-3", "Add remark for  chief complaint");
		CheckFunctionalityOfChiefComplants.put("Step-4", "Remove chief complaint");
		CheckFunctionalityOfChiefComplants.put("Step-5", "Save chief complaint");

		//====AV (Past History)
		
		CheckFunctionalityOfPastHistory.put("Step-1", "Go to Past History Tab");
		CheckFunctionalityOfPastHistory.put("Step-2", "Fill Occupational History");
		CheckFunctionalityOfPastHistory.put("Step-3", "Fill Smoking History");
		CheckFunctionalityOfPastHistory.put("Step-4", "Fill History of Substance Abuse / Exposure");
		CheckFunctionalityOfPastHistory.put("Step-5", "Fill Menstrual History");
		CheckFunctionalityOfPastHistory.put("Step-6", "Fill Allergy History");
		CheckFunctionalityOfPastHistory.put("Step-7", "Fill Known Co-existent Diseases");
		CheckFunctionalityOfPastHistory.put("Step-8", "Fill Past Illness");
		CheckFunctionalityOfPastHistory.put("Step-9", "Fill Family History of Illness");
		CheckFunctionalityOfPastHistory.put("Step-10", "Fill Drug History and Current Medication");
		CheckFunctionalityOfPastHistory.put("Step-11", " Clear past history");

		//====AV (History Of Presentillness)
		
		CheckFunctionalityOfHistoryOfPresentillness.put("Step-1", "Go to History of Present illness Tab");
		CheckFunctionalityOfHistoryOfPresentillness.put("Step-2", "Add history of present Illness");
		CheckFunctionalityOfHistoryOfPresentillness.put("Step-3", "Clear History of present illness");
		CheckFunctionalityOfHistoryOfPresentillness.put("Step-4", "Save history of present illness");
		
		//====AV (Referral Advice)

		CheckFunctionalityOfRefferalAdvice.put("Step-1", "Go to Referral Advice Tab");
		CheckFunctionalityOfRefferalAdvice.put("Step-2", "Select Hospital");
		CheckFunctionalityOfRefferalAdvice.put("Step-3", "Select specialization");
		CheckFunctionalityOfRefferalAdvice.put("Step-4", "Enter Reason");
		CheckFunctionalityOfRefferalAdvice.put("Step-5", "Click on Add button");
		CheckFunctionalityOfRefferalAdvice.put("Step-6", "Delete Added referral Advice");
		CheckFunctionalityOfRefferalAdvice.put("Step-7", "Save Referral Advice");
		
		//====AV (Follow up)
		
		CheckFunctionalityOfFollowUp.put("Step-1", "Go to Referral Advice Tab");
		CheckFunctionalityOfFollowUp.put("Step-2", "Click on Radio button of follow up");
		CheckFunctionalityOfFollowUp.put("Step-3", "Enter after number of days");
		CheckFunctionalityOfFollowUp.put("Step-4", "click on datebox");
		CheckFunctionalityOfFollowUp.put("Step-5", "click on save button");


		//====AV (Medication-Prescription)
		
		CheckFunctionalityofmedicationInPrescriptions.put("Step-1", "Go to Prescription Tab");
		CheckFunctionalityofmedicationInPrescriptions.put("Step-2", "Add order pack");
		CheckFunctionalityofmedicationInPrescriptions.put("Step-3", "Add Medication");
		CheckFunctionalityofmedicationInPrescriptions.put("Step-4", "Add FUP");
		CheckFunctionalityofmedicationInPrescriptions.put("Step-5", "Add FUP");
		CheckFunctionalityofmedicationInPrescriptions.put("Step-6", "Delete FUP");
		CheckFunctionalityofmedicationInPrescriptions.put("Step-7", "Save FUP");
		
		
		//====AV (Investigation-Prescription)


		CheckFunctionalityOfInvesitgationPrescriptions.put("Step-1", "Go to investigation tab");
		CheckFunctionalityOfInvesitgationPrescriptions.put("Step-2", "ADD investigation");
		CheckFunctionalityOfInvesitgationPrescriptions.put("Step-3", "Add investigation Remark");
		CheckFunctionalityOfInvesitgationPrescriptions.put("Step-4", "Save investigation");
		
		
		//====AV (Diagnosis-Prescription)
		
		CheckFunctionalityOfDiagnosisPrescriptions.put("Step-1","Go to Diagnosis Tab");
		CheckFunctionalityOfDiagnosisPrescriptions.put("Step-2","Add Diagnosis");
		CheckFunctionalityOfDiagnosisPrescriptions.put("Step-3","Add FUP Diagnosis");
		CheckFunctionalityOfDiagnosisPrescriptions.put("Step-4","Delete Diagnosis");
		CheckFunctionalityOfDiagnosisPrescriptions.put("Step-5","Save Diagnosis");
		
		//====AV (Clinical Advice-Prescription)
		
		CheckFunctionalityOfclinicaladvicePrescriptions.put("Step-1", "Go to Clinical Advice Tab");
		CheckFunctionalityOfclinicaladvicePrescriptions.put("Step-2", "Add Clinial Advice");
		CheckFunctionalityOfclinicaladvicePrescriptions.put("Step-3", "Add Remark");
		CheckFunctionalityOfclinicaladvicePrescriptions.put("Step-4", "Save Clinical Advice");














	}
	
	
	
	
	
	
	
	
	
	
	
	public static Map<String,String> getFuncnctionlity(String key){
		System.out.println("getFuncnctionlity-key : "+key);
		if(key.equalsIgnoreCase("doLoginTest")){
			return doLoginTest;
		}else if(key.equalsIgnoreCase("doNavigateToSelectHospitalLocationTest")){
			return doNavigateToSelectHospitalLocationTest;
		}else if(key.equalsIgnoreCase("doNavigateToHISHomeTest")){
			return doNavigateToHISHomeTest;
		}else if(key.equalsIgnoreCase("CDR_Patient_Folder_TC_03")){
			return CDR_Patient_Folder_TC_03;			
		}		
	else if(key.equalsIgnoreCase("CDR_Patient_Folder_TC_04")){
		return CDR_Patient_Folder_TC_04;
	}
	else if(key.equalsIgnoreCase("CDR_Patient_Folder_TC_05")){
		return CDR_Patient_Folder_TC_05;
	}
	else if(key.equalsIgnoreCase("CDR_Patient_Folder_TC_06")){
		return CDR_Patient_Folder_TC_06;
	}
	else if(key.equalsIgnoreCase("CDR_Patient_Folder_TC_07")){
		return CDR_Patient_Folder_TC_07;
	}
	else if(key.equalsIgnoreCase("CDR_Patient_Folder_TC_08")){
		return CDR_Patient_Folder_TC_08;
	}
	else if(key.equalsIgnoreCase("CDR_Patient_Folder_TC_09")){
		return CDR_Patient_Folder_TC_09;
	}
	else if(key.equalsIgnoreCase("doNavigateToCDRTest")){
		return doNavigateToCDRTest;
	}
	else if(key.equalsIgnoreCase("doNavigateToUHIDcreationLinkTest")){
		return doNavigateToUHIDcreationLinkTest;
	}
	else if(key.equalsIgnoreCase("To_Check_Functionality_SaveButton")){
		return To_Check_Functionality_SaveButton;
	}
	else if(key.equalsIgnoreCase("To_Check_Functionality_UHIDSearch")){
		return To_Check_Functionality_UHIDSearch;
	}
	else if(key.equalsIgnoreCase("To_Check_Functionality_UpdateButton")){
		return To_Check_Functionality_UpdateButton;
	}
	else if(key.equalsIgnoreCase("Check_the_Functionality_Of_OPDNumber")){
		return Check_the_Functionality_Of_OPDNumber;
	}
	else if(key.equalsIgnoreCase("Check_FunctionalityOf_ClearButton")){
		return Check_FunctionalityOf_ClearButton;
	}
	
	else if(key.equalsIgnoreCase("Search_Patient_detailBy_IPnumber")){
		return Search_Patient_detailBy_IPnumber;
	}
	else if(key.equalsIgnoreCase("doNavigateToPatientCheckInTest")){
		return doNavigateToPatientCheckInTest;
	}
	else if(key.equalsIgnoreCase("Check_TheFunctionality_IPNumber")){
		return Check_TheFunctionality_IPNumber;
	}
	else if(key.equalsIgnoreCase("to_checkThe_functionality_PrintButton")){
		return to_checkThe_functionality_PrintButton;
	}
	else if(key.equalsIgnoreCase("doTestRefferls")){
		return doTestRefferls;
	}
	else if(key.equalsIgnoreCase("doTestTodays_Appointment_Button")){
		return doTestTodays_Appointment_Button;
	}
	else if(key.equalsIgnoreCase("toCheck_theFunctionality_UHIDSearch")){
		return toCheck_theFunctionality_UHIDSearch;
	}
		
	else if(key.equalsIgnoreCase("doNavigateToCheck_In_Admission_of_Reffered_PatientsLink")){
		return doNavigateToCheck_In_Admission_of_Reffered_PatientsLink;
	}
	else if(key.equalsIgnoreCase("Registration_Check_in_Admission_to_Referred_Patients_TC_1")){
		return Registration_Check_in_Admission_to_Referred_Patients_TC_1;
	}
	else if(key.equalsIgnoreCase("Registration_Check_in_Admission_to_Referred_Patients_TC_2")){
		return Registration_Check_in_Admission_to_Referred_Patients_TC_2;
	}
	else if(key.equalsIgnoreCase("Registration_Check_in_Admission_to_Referred_Patients_TC_3")){
		return Registration_Check_in_Admission_to_Referred_Patients_TC_3;
	}
	else if(key.equalsIgnoreCase("Registration_Check_in_Admission_to_Referred_Patients_TC_5")){
		return Registration_Check_in_Admission_to_Referred_Patients_TC_5;
	}
	else if(key.equalsIgnoreCase("Registration_Check_in_Admission_to_Referred_Patients_TC_6")){
		return Registration_Check_in_Admission_to_Referred_Patients_TC_6;
	}
			
	else if(key.equalsIgnoreCase("doNavigateToPatientAdmissionTest")){
		return doNavigateToPatientAdmissionTest;
	}
	else if(key.equalsIgnoreCase("Registration_Patient_Admission_TC_1")){
		return Registration_Patient_Admission_TC_1;
	}
	else if(key.equalsIgnoreCase("Registration_Patient_Admission_TC_2")){
		return Registration_Patient_Admission_TC_2;
	}
	else if(key.equalsIgnoreCase("Registration_Patient_Admission_TC_3")){
		return Registration_Patient_Admission_TC_3;
	}
	else if(key.equalsIgnoreCase("Registration_Patient_Admission_TC_5")){
		return Registration_Patient_Admission_TC_5;
	}
	else if(key.equalsIgnoreCase("Registration_Patient_Admission_TC_7")){
		return Registration_Patient_Admission_TC_7;
	}
	else if(key.equalsIgnoreCase("Registration_Patient_Admission_TC_9")){
		return Registration_Patient_Admission_TC_9;
	}
	else if(key.equalsIgnoreCase("Registration_Patient_Admission_TC_6")){
		return Registration_Patient_Admission_TC_6;
	}
		
	else if(key.equalsIgnoreCase("doNavigateToCancelCheckinTest")){
		return doNavigateToCancelCheckinTest;
	}
		
	else if(key.equalsIgnoreCase("Registration_Cancel_check_in_01")){
		return Registration_Cancel_check_in_01;
	}
	else if(key.equalsIgnoreCase("Registration_Cancel_check_in_03")){
		return Registration_Cancel_check_in_03;
	}
	else if(key.equalsIgnoreCase("Registration_Cancel_check_in_04")){
		return Registration_Cancel_check_in_04;
	}
	else if(key.equalsIgnoreCase("Registration_Cancel_check_in_05")){
		return Registration_Cancel_check_in_05;
	}
	else if(key.equalsIgnoreCase("Registration_Cancel_check_in_06")){
		return Registration_Cancel_check_in_06;
	}
	else if(key.equalsIgnoreCase("doNavigateToEmergency_Check_In_RegistrationPagesLink")){
		return doNavigateToEmergency_Check_In_RegistrationPagesLink;
	}
	else if(key.equalsIgnoreCase("Registration_Emergency_Checkin_Registration_TC_1")){
		return Registration_Emergency_Checkin_Registration_TC_1;
	}
	else if(key.equalsIgnoreCase("Registration_Emergency_Checkin_Registration_TC_2")){
		return Registration_Emergency_Checkin_Registration_TC_2;
	}
	else if(key.equalsIgnoreCase("Registration_Emergency_Checkin_Registration_TC_3")){
		return Registration_Emergency_Checkin_Registration_TC_3;
	}
	else if(key.equalsIgnoreCase("Registration_Emergency_Checkin_Registration_TC_4")){
		return Registration_Emergency_Checkin_Registration_TC_4;
	}
	else if(key.equalsIgnoreCase("Registration_Emergency_Checkin_Registration_TC_5")){
		return Registration_Emergency_Checkin_Registration_TC_5;
	}
	else if(key.equalsIgnoreCase("Registration_Emergency_Checkin_Registration_TC_7")){
		return Registration_Emergency_Checkin_Registration_TC_7;
	}
	else if(key.equalsIgnoreCase("Registration_Emergency_Checkin_Registration_TC_8")){
		return Registration_Emergency_Checkin_Registration_TC_8;
	}
	else if(key.equalsIgnoreCase("doNavigateToBedStatusLink")){
		return doNavigateToBedStatusLink;
	}
	else if(key.equalsIgnoreCase("Registration_Bed_Status_TC_1")){
		return Registration_Bed_Status_TC_1;
	}
	else if(key.equalsIgnoreCase("Registration_Bed_Status_TC_2")){
		return Registration_Bed_Status_TC_2;
	}
	else if(key.equalsIgnoreCase("Registration_Bed_Status_TC_3")){
		return Registration_Bed_Status_TC_3;
	}
	else if(key.equalsIgnoreCase("Registration_Bed_Status_TC_4")){
		return Registration_Bed_Status_TC_4;
	}
		
		else if(key.equalsIgnoreCase("DoNatigatetoLinkRegistration_Report")){
			return DoNatigatetoLinkRegistration_Report;
		}
	else if(key.equalsIgnoreCase("RegistrationReport_TC_1")){
		return RegistrationReport_TC_1;
	}
	else if(key.equalsIgnoreCase("RegistrationReport_TC_2")){
		return RegistrationReport_TC_2;
	}
	else if(key.equalsIgnoreCase("RegistrationReport_TC_3")){
		return RegistrationReport_TC_3;
	}
	else if(key.equalsIgnoreCase("RegistrationReport_TC_4")){
		return RegistrationReport_TC_4;
	}
		
	else if(key.equalsIgnoreCase("doNavigateToDoctorWorklistTest")){
		return doNavigateToDoctorWorklistTest;
	}
	else if(key.equalsIgnoreCase("doNavigateToDoctorWorkListAndSelectMiniCaseSheet")){
		return doNavigateToDoctorWorkListAndSelectMiniCaseSheet;
	}
	else if(key.equalsIgnoreCase("CLM_Mini_Standard_Casesheet_5")){
		return CLM_Mini_Standard_Casesheet_5;
	}
	else if(key.equalsIgnoreCase("CLM_Mini_Standard_Casesheet_6")){
		return CLM_Mini_Standard_Casesheet_6;
	}
	else if(key.equalsIgnoreCase("CLM_Mini_Standard_Casesheet_7")){
		return CLM_Mini_Standard_Casesheet_7;
	}
	else if(key.equalsIgnoreCase("CLM_Mini_Standard_Casesheet_8")){
		return CLM_Mini_Standard_Casesheet_8;
	}
	else if(key.equalsIgnoreCase("CLM_Mini_Standard_Casesheet_9")){
		return CLM_Mini_Standard_Casesheet_9;
	}
	else if(key.equalsIgnoreCase("CLM_Mini_Standard_Casesheet_10")){
		return CLM_Mini_Standard_Casesheet_10;
	}
	else if(key.equalsIgnoreCase("CLM_Mini_Standard_Casesheet_11")){
		return CLM_Mini_Standard_Casesheet_11;
	}
	else if(key.equalsIgnoreCase("CLM_Mini_Standard_Casesheet_15")){
		return CLM_Mini_Standard_Casesheet_15;
	}
	else if(key.equalsIgnoreCase("CLM_Mini_Standard_Casesheet_17")){
		return CLM_Mini_Standard_Casesheet_17;
	}
	
	else if(key.equalsIgnoreCase("doNavigateToClinicalRecord_DoctorWorkList")){
		return doNavigateToClinicalRecord_DoctorWorkList;
	}
	else if(key.equalsIgnoreCase("dotestcaseforCheifComplain")){
		return dotestcaseforCheifComplain;
	}
	else if(key.equalsIgnoreCase("dotestcaseforHistoryofpresentIllness")){
		return dotestcaseforHistoryofpresentIllness;
	}
	else if(key.equalsIgnoreCase("dotestcaseforPastHistory")){
		return dotestcaseforPastHistory;
	}
	else if(key.equalsIgnoreCase("dotestcaseforGenralExamination")){
		return dotestcaseforGenralExamination;
	}
	else if(key.equalsIgnoreCase("dotestcaseforSystemicExamination")){
		return dotestcaseforSystemicExamination;
	}
	else if(key.equalsIgnoreCase("dotestcaseforLocal_SpecialExamination")){
		return dotestcaseforLocal_SpecialExamination;
	}
	else if(key.equalsIgnoreCase("dotestcaseforDiagnose")){
		return dotestcaseforDiagnose;
	}
	else if(key.equalsIgnoreCase("dotestcaseforMedicine")){
		return dotestcaseforMedicine;
	}
	else if(key.equalsIgnoreCase("dotestcaseforInvestigation")){
		return dotestcaseforInvestigation;
	}
	else if(key.equalsIgnoreCase("dotestcaseforHealthInvestigation")){
		return dotestcaseforHealthInvestigation;
	}
	else if(key.equalsIgnoreCase("dotestcaseforOrderPack")){
		return dotestcaseforOrderPack;
	}
	else if(key.equalsIgnoreCase("doNavigatetoIPCaseshet")){
		return doNavigatetoIPCaseshet;
	}
	else if(key.equalsIgnoreCase("doNavigateToClinicalRecord_genrate_certificate")){
		return doNavigateToClinicalRecord_genrate_certificate;
	}
	else if(key.equalsIgnoreCase("doNavigateToClinicalRecord_genrate_Maternitiy_certificate")){
		return doNavigateToClinicalRecord_genrate_Maternitiy_certificate;
	}
	else if(key.equalsIgnoreCase("doNavigateToClinicalRecord_Inpatients_EmergencyPatients")){
		return doNavigateToClinicalRecord_Inpatients_EmergencyPatients;
	}
	else if(key.equalsIgnoreCase("doANMServicesTest")){
		return doANMServicesTest;
	}
	else if(key.equalsIgnoreCase("CLM_ANM_servicess_TC_004")){
		return CLM_ANM_servicess_TC_004;
	}
	else if(key.equalsIgnoreCase("CLM_ANM_servicess_TC_005")){
		return CLM_ANM_servicess_TC_005;
	}
	else if(key.equalsIgnoreCase("CLM_ANM_servicess_TC_006")){
		return CLM_ANM_servicess_TC_006;
	}else if(key.equalsIgnoreCase("CLM_ANM_servicess_TC_0010")){
		return CLM_ANM_servicess_TC_0010;
	}else if(key.equalsIgnoreCase("CLM_ANM_servicess_TC_008")){
		return CLM_ANM_servicess_TC_008;
	}
		
	else if(key.equalsIgnoreCase("doNavigateTogetDischargeIntimationLinkTest")){
		return doNavigateTogetDischargeIntimationLinkTest;
	}
	else if(key.equalsIgnoreCase("CLM_Discharge_Intimation_TC_4")){
		return CLM_Discharge_Intimation_TC_4;
	}
	else if(key.equalsIgnoreCase("CLM_Discharge_Intimation_TC_5")){
		return CLM_Discharge_Intimation_TC_5;
	}
	else if(key.equalsIgnoreCase("doNavigateToFUPTest")){
		return doNavigateToFUPTest;
	}
	else if(key.equalsIgnoreCase("CLM_Frequently_Used_Packs_TC_04")){
		return CLM_Frequently_Used_Packs_TC_04;
	}
	else if(key.equalsIgnoreCase("CLM_Frequently_Used_Packs_TC_05")){
		return CLM_Frequently_Used_Packs_TC_05;
	}
	else if(key.equalsIgnoreCase("CLM_Frequently_Used_Packs_TC_07")){
		return CLM_Frequently_Used_Packs_TC_07;
	}
	else if(key.equalsIgnoreCase("doNavigateToOrderPacksTest")){
		return doNavigateToOrderPacksTest;
	}
	else if(key.equalsIgnoreCase("CLM_Order_Packs_TC_03")){
		return CLM_Order_Packs_TC_03;
	}
	else if(key.equalsIgnoreCase("CLM_Order_Packs_TC_06")){
		return CLM_Order_Packs_TC_06;
	}
	else if(key.equalsIgnoreCase("CLM_Order_Packs_TC_04")){
		return CLM_Order_Packs_TC_04;
	}
	else if(key.equalsIgnoreCase("CLM_Order_Packs_TC_07")){
		return CLM_Order_Packs_TC_07;
	}
	else if(key.equalsIgnoreCase("doNavigateTogetDischargeSummaryLinkTest")){
		return doNavigateTogetDischargeSummaryLinkTest;
	}
	else if(key.equalsIgnoreCase("CLM_Discharge_Summary_TC_6")){
		return CLM_Discharge_Summary_TC_6;
	}
	else if(key.equalsIgnoreCase("CLM_Discharge_Summary_TC_7")){
		return CLM_Discharge_Summary_TC_7;
	}
	else if(key.equalsIgnoreCase("CLM_Discharge_Summary_TC_10")){
		return CLM_Discharge_Summary_TC_10;
	}
	else if(key.equalsIgnoreCase("doNavigateToOpenVisitTest")){
		return doNavigateToOpenVisitTest;
	}
	else if(key.equalsIgnoreCase("CLM_Open_Visits_TC_5")){
		return CLM_Open_Visits_TC_5;
	}
	else if(key.equalsIgnoreCase("CLM_Open_Visits_TC_6")){
		return CLM_Open_Visits_TC_6;
	}
	else if(key.equalsIgnoreCase("CLM_Open_Visits_TC_7")){
		return CLM_Open_Visits_TC_7;
	}
	else if(key.equalsIgnoreCase("CLM_Open_Visits_TC_8")){
		return CLM_Open_Visits_TC_8;
	}
	else if(key.equalsIgnoreCase("CLM_Open_Visits_TC_9")){
		return CLM_Open_Visits_TC_9;
	}
	else if(key.equalsIgnoreCase("doNavigateToEditCertificateTest")){
		return doNavigateToEditCertificateTest;
	}
	else if(key.equalsIgnoreCase("CheckTheFunctionalityOfRequestForChangedUPdateButton")){
		return CheckTheFunctionalityOfRequestForChangedUPdateButton;
	}
	else if(key.equalsIgnoreCase("ChecktheFunctionalityOftoNavigateToEditMeternityCertificatePages")){
		return ChecktheFunctionalityOftoNavigateToEditMeternityCertificatePages;
	}
	else if(key.equalsIgnoreCase("ChecktheFunctionalityOfUpdateButtonOfEditMeternityCertificatePages")){
		return ChecktheFunctionalityOfUpdateButtonOfEditMeternityCertificatePages;
	}
	else if(key.equalsIgnoreCase("donavigatetoworklaboratory")){
		return donavigatetoworklaboratory;
	}
	else if(key.equalsIgnoreCase("doNavigatetoIPCaseshetForLab")){
		return doNavigatetoIPCaseshetForLab;
	}
	else if(key.equalsIgnoreCase("doNavigatetoChangeLocation")){
		return doNavigatetoChangeLocation;
	}
	else if(key.equalsIgnoreCase("doNavigateToTestCaseForLabWorkListInpatient")){
		return doNavigateToTestCaseForLabWorkListInpatient;
	}
	else if(key.equalsIgnoreCase("DoTestforTestresultEntry")){
		return DoTestforTestresultEntry;
	}
	else if(key.equalsIgnoreCase("DonavigatetoBulkResultEntry")){
		return DonavigatetoBulkResultEntry;
	}
	else if(key.equalsIgnoreCase("changeHospitalLocationForBulkResultverificationTest")){
		return changeHospitalLocationForBulkResultverificationTest;
	}
	else if(key.equalsIgnoreCase("TestCasefordDispatchReportInpatient")){
		return TestCasefordDispatchReportInpatient;
	}
	else if(key.equalsIgnoreCase("changeHospitalLocationforgroup_printing_InpatientTest")){
		return changeHospitalLocationforgroup_printing_InpatientTest;
	}
	else if(key.equalsIgnoreCase("donavigateTolaboratoryTest")){
		return donavigateTolaboratoryTest;
	}
	else if(key.equalsIgnoreCase("donavigateTolaboratoryPrescriptionTest")){
		return donavigateTolaboratoryPrescriptionTest;
	}
	else if(key.equalsIgnoreCase("doNavigateToImagingWorklistLinkTest")){
		return doNavigateToImagingWorklistLinkTest;
	}
	else if(key.equalsIgnoreCase("doImagingWorklistOPFlowTest")){
		return doImagingWorklistOPFlowTest;
	}
	else if(key.equalsIgnoreCase("doImagingWorklistOPFlowPATest")){
		return doImagingWorklistOPFlowPATest;
	}
	else if(key.equalsIgnoreCase("doImagingWorklistOPFlowTestPerfTest")){
		return doImagingWorklistOPFlowTestPerfTest;
	}
	else if(key.equalsIgnoreCase("doImagingWorklistOPFlowResultEntryTest")){
		return doImagingWorklistOPFlowResultEntryTest;
	}
	else if(key.equalsIgnoreCase("doImagingWorklistOPFlowResultverifyTest")){
		return doImagingWorklistOPFlowResultverifyTest;
	}
	else if(key.equalsIgnoreCase("doImagingWorklistOPFlowDispatchTest")){
		return doImagingWorklistOPFlowDispatchTest;
	}
	else if(key.equalsIgnoreCase("doImagingWorklistIPFlowTest")){
		return doImagingWorklistIPFlowTest;
	}
	else if(key.equalsIgnoreCase("doImagingWorklistIPFlowPATest")){
		return doImagingWorklistIPFlowPATest;
	}
	else if(key.equalsIgnoreCase("doImagingWorklistIPFlowTestPerfTest")){
		return doImagingWorklistIPFlowTestPerfTest;
	}
	else if(key.equalsIgnoreCase("doImagingWorklistIPFlowResultEntryTest")){
		return doImagingWorklistIPFlowResultEntryTest;
	}
	else if(key.equalsIgnoreCase("doNavigateToPatientCheckinLinkTest")){
		return doNavigateToPatientCheckinLinkTest;
	}
	else if(key.equalsIgnoreCase("doCreateCheckInPageTest")){
		return doCreateCheckInPageTest;
	}
	else if(key.equalsIgnoreCase("dodoctorworklist")){
		return dodoctorworklist;
	}
	else if(key.equalsIgnoreCase("doNavigateToHISHomeTestforfacilityStore")){
		return doNavigateToHISHomeTestforfacilityStore;
	}
	else if(key.equalsIgnoreCase("dofacilityStore")){
		return dofacilityStore;
	}
	else if(key.equalsIgnoreCase("doNavigateToHISHomeTestforLaboratoryworklist")){
		return doNavigateToHISHomeTestforLaboratoryworklist;
	}
	else if(key.equalsIgnoreCase("testcaseforLaboratoryworkListOPD")){
		return testcaseforLaboratoryworkListOPD;
	}
	else if(key.equalsIgnoreCase("doNavigateToHISHomeTestforImagingServices")){
		return doNavigateToHISHomeTestforImagingServices;
	}
	else if(key.equalsIgnoreCase("doImagingServices")){
		return doImagingServices;
	}
		
		
		
	else if(key.equalsIgnoreCase("dotestcaseIPDFlowPagepatientInpatientmanagement")){
		return dotestcaseIPDFlowPagepatientInpatientmanagement;
	}
	else if(key.equalsIgnoreCase("dotestcaseIPDFlowPagepatientIPcasesheetPrecription")){
		return dotestcaseIPDFlowPagepatientIPcasesheetPrecription;
	}
	else if(key.equalsIgnoreCase("testcaseforInpatientIssues")){
		return testcaseforInpatientIssues;
	}
	else if(key.equalsIgnoreCase("testcaseforLaboratory")){
		return testcaseforLaboratory;
	}
	else if(key.equalsIgnoreCase("TestcaseforImaggingServices")){
		return TestcaseforImaggingServices;
	}
		
	else if(key.equalsIgnoreCase("TestcaseforDischageIntimation")){
		return TestcaseforDischageIntimation;
	}
		
		else if(key.equalsIgnoreCase("testcaseforDeathRecrd")){
			return testcaseforDeathRecrd;
		}
		else if(key.equalsIgnoreCase("changeHospitalLocationTest")){
			return changeHospitalLocationTest;
		}
		else if(key.equalsIgnoreCase("testcaseforbirthRegistration")){
			return testcaseforbirthRegistration;
		}
		else if(key.equalsIgnoreCase("doNavigateToPhysicalStockEntryLink")){
			return doNavigateToPhysicalStockEntryLink;
		}
		else if(key.equalsIgnoreCase("TC_Store_Physical_Stock_Entry_004")){
			return TC_Store_Physical_Stock_Entry_004;
		}
		else if(key.equalsIgnoreCase("TC_Store_Physical_Stock_Entry_005")){
			return TC_Store_Physical_Stock_Entry_005;
		}
		else if(key.equalsIgnoreCase("TC_Store_Physical_Stock_Entry_006")){
			return TC_Store_Physical_Stock_Entry_006;
		}
		else if(key.equalsIgnoreCase("TC_Store_Physical_Stock_Entry_007")){
			return TC_Store_Physical_Stock_Entry_007;
		}
		else if(key.equalsIgnoreCase("TC_Store_Physical_Stock_Entry_008")){
			return TC_Store_Physical_Stock_Entry_008;
		}
		else if(key.equalsIgnoreCase("TC_Store_Physical_Stock_Entry_012")){
			return TC_Store_Physical_Stock_Entry_012;
		}
		else if(key.equalsIgnoreCase("doNavigateAlterMRPLinkTest")){
			return doNavigateAlterMRPLinkTest;
		}
		else if(key.equalsIgnoreCase("TC_Alter_MRP_004")){
			return TC_Alter_MRP_004;
		}
		else if(key.equalsIgnoreCase("TC_Alter_MRP_005")){
			return TC_Alter_MRP_005;
		}
		else if(key.equalsIgnoreCase("TC_Alter_MRP_007")){
			return TC_Alter_MRP_007;
		}
		
		else if(key.equalsIgnoreCase("doNavigateAdjustmentLinkTest")){
			return doNavigateAdjustmentLinkTest;
		}
		else if(key.equalsIgnoreCase("TC_Store_Adjustment_004")){
			return TC_Store_Adjustment_004;
		}
		else if(key.equalsIgnoreCase("TC_Store_Adjustment_005")){
			return TC_Store_Adjustment_005;
		}
		else if(key.equalsIgnoreCase("TC_Store_Adjustment_006")){
			return TC_Store_Adjustment_006;
		}
		else if(key.equalsIgnoreCase("TC_Store_Adjustment_008")){
			return TC_Store_Adjustment_008;
		}
		else if(key.equalsIgnoreCase("TC_Store_Adjustment_009")){
			return TC_Store_Adjustment_009;
		}
		else if(key.equalsIgnoreCase("TC_Store_Adjustment_010")){
			return TC_Store_Adjustment_010;
		}
		else if(key.equalsIgnoreCase("TC_Store_Adjustment_011")){
			return TC_Store_Adjustment_011;
		}
		else if(key.equalsIgnoreCase("TC_Store_Adjustment_012")){
			return TC_Store_Adjustment_012;
		}
		else if(key.equalsIgnoreCase("doNavigateStoreConsumptionTest")){
			return doNavigateStoreConsumptionTest;
		}
		else if(key.equalsIgnoreCase("TC_Store_Consumption_004")){
			return TC_Store_Consumption_004;
		}
		else if(key.equalsIgnoreCase("TC_Store_Consumption_005")){
			return TC_Store_Consumption_005;
		}
		else if(key.equalsIgnoreCase("TC_Store_Consumption_006")){
			return TC_Store_Consumption_006;
		}
		else if(key.equalsIgnoreCase("TC_Store_Consumption_009")){
			return TC_Store_Consumption_009;
		}
		else if(key.equalsIgnoreCase("TC_Store_Consumption_010")){
			return TC_Store_Consumption_010;
		}
		else if(key.equalsIgnoreCase("TC_Store_Consumption_011")){
			return TC_Store_Consumption_011;
		}
		else if(key.equalsIgnoreCase("TC_Store_Consumption_012")){
			return TC_Store_Consumption_012;
		}
		else if(key.equalsIgnoreCase("doNavigateLossBreakageLinkTest")){
			return doNavigateLossBreakageLinkTest;
		}
		else if(key.equalsIgnoreCase("TC_Store_Loss_and_Breakage_004")){
			return TC_Store_Loss_and_Breakage_004;
		}
		else if(key.equalsIgnoreCase("TC_Store_Loss_and_Breakage_005")){
			return TC_Store_Loss_and_Breakage_005;
		}
		else if(key.equalsIgnoreCase("TC_Store_Loss_and_Breakage_006")){
			return TC_Store_Loss_and_Breakage_006;
		}
		else if(key.equalsIgnoreCase("TC_Store_Loss_and_Breakage_009")){
			return TC_Store_Loss_and_Breakage_009;
		}
		else if(key.equalsIgnoreCase("TC_Store_Loss_and_Breakage_010")){
			return TC_Store_Loss_and_Breakage_010;
		}
		else if(key.equalsIgnoreCase("TC_Store_Loss_and_Breakage_011")){
			return TC_Store_Loss_and_Breakage_011;
		}
		else if(key.equalsIgnoreCase("TC_Store_Loss_and_Breakage_012")){
			return TC_Store_Loss_and_Breakage_012;
		}
		else if(key.equalsIgnoreCase("donavigateToDownloadCRCItemTest")){
			return donavigateToDownloadCRCItemTest;
		}
		else if(key.equalsIgnoreCase("doTestForDownloadCRCItemListTest")){
			return doTestForDownloadCRCItemListTest;
		}
		else if(key.equalsIgnoreCase("doNavigateIndentOrderLinkTest")){
			return doNavigateIndentOrderLinkTest;
		}
		else if(key.equalsIgnoreCase("doIndentOrderTest")){
			return doIndentOrderTest;
		}
		else if(key.equalsIgnoreCase("doIndentWorklistViewIndentApproveFromStoreTest")){
			return doIndentWorklistViewIndentApproveFromStoreTest;
		}
		else if(key.equalsIgnoreCase("doIndentWorklistViewIndentApproveToStoreTest")){
			return doIndentWorklistViewIndentApproveToStoreTest;
		}
		else if(key.equalsIgnoreCase("doIndentWorklistIssueIndentToStoreTest")){
			return doIndentWorklistIssueIndentToStoreTest;
		}
		else if(key.equalsIgnoreCase("WardBedStatus")){
			return WardBedStatus;
		}
		else if(key.equalsIgnoreCase("WardDashBoard")){
			return WardDashBoard;
		}
		else if(key.equalsIgnoreCase("PatientDischarge")){
			return PatientDischarge;
		}
		else if(key.equalsIgnoreCase("PrimaryDoctorChange")){
			return PrimaryDoctorChange;
		}
		else if(key.equalsIgnoreCase("NurseTasks")){
			return NurseTasks;
		}
		else if(key.equalsIgnoreCase("BedsideProceduresOrder")){
			return BedsideProceduresOrder;
		}
		else if(key.equalsIgnoreCase("specialtyprocedurerequest")){
			return specialtyprocedurerequest;
		}
		else if(key.equalsIgnoreCase("ProgressNotes")){
			return ProgressNotes;
		}
		else if(key.equalsIgnoreCase("VitalsEntry")){
			return VitalsEntry;
		}
		else if(key.equalsIgnoreCase("IntakeOutputEntry")){
			return IntakeOutputEntry;
		}
		else if(key.equalsIgnoreCase("WardUnit")){
			return WardUnit;
		}
		else if(key.equalsIgnoreCase("Transferbed")){
			return Transferbed;
		}
		else if(key.equalsIgnoreCase("InvestigationRequest")){
			return InvestigationRequest;
		}
		else if(key.equalsIgnoreCase("TranferRequestofWard")){
			return TranferRequestofWard;
		}
		else if(key.equalsIgnoreCase("doNavigateTopatientCheck_in_Link")){
			return doNavigateTopatientCheck_in_Link;
		}
		else if(key.equalsIgnoreCase("doTestForcreatePatientCheck_IN")){
			return doTestForcreatePatientCheck_IN;
		}
		else if(key.equalsIgnoreCase("dotestforOT_PAC")){
			return dotestforOT_PAC;
		}
		else if(key.equalsIgnoreCase("doNavigateToOTandResourceSchedulingTest")){
			return doNavigateToOTandResourceSchedulingTest;
		}
		else if(key.equalsIgnoreCase("doOTandResourceSchedulingnTest")){
			return doOTandResourceSchedulingnTest;
		}
		else if(key.equalsIgnoreCase("doNavigateToOTandResourceSchedulingTest")){
			return doNavigateToOTandResourceSchedulingTest;
		}
		else if(key.equalsIgnoreCase("dotestcaseforotoperativeotnotesLink")){
			return dotestcaseforotoperativeotnotesLink;
		}
		else if(key.equalsIgnoreCase("doNavigateToOTPrescriptionLink")){
			return doNavigateToOTPrescriptionLink;
		}
		else if(key.equalsIgnoreCase("donavigateTotestcaseOTprescription")){
			return donavigateTotestcaseOTprescription;
		}
		else if(key.equalsIgnoreCase("doNavigateToDosageType")){
			return doNavigateToDosageType;
		}
		else if(key.equalsIgnoreCase("CLM_Dosage_Types_TC_4")){
			return CLM_Dosage_Types_TC_4;
		}
		else if(key.equalsIgnoreCase("CLM_Dosage_Types_TC_6")){
			return CLM_Dosage_Types_TC_6;
		}
		else if(key.equalsIgnoreCase("doNavigateToClinical_Record_Reports")){
			return doNavigateToClinical_Record_Reports;
		}
		else if(key.equalsIgnoreCase("checkTheFunctionalityOfItemMasterdata")){
			return checkTheFunctionalityOfItemMasterdata;
		}
		else if(key.equalsIgnoreCase("checkTheFunctionalityOfprescreption_itemIssue")){
			return checkTheFunctionalityOfprescreption_itemIssue;
		}
		else if(key.equalsIgnoreCase("checkTheFunctionalityOfStockStatus_StationWise")){
			return checkTheFunctionalityOfStockStatus_StationWise;
		}
		else if(key.equalsIgnoreCase("checkTheFunctionalityOfExportReport")){
			return checkTheFunctionalityOfExportReport;
		}
		else if(key.equalsIgnoreCase("ChecktheFunctionalityofClearButton")){
			return ChecktheFunctionalityofClearButton;
		}
		
		else if(key.equalsIgnoreCase("doNavigateToDrWorkList")){
			return doNavigateToDrWorkList;
		}
		
		else if(key.equalsIgnoreCase("donavigatetoVideoConsultationpage")){
			return donavigatetoVideoConsultationpage;
		}
		else if(key.equalsIgnoreCase("CheckFunctionalityOfChiefComplants")){
			return CheckFunctionalityOfChiefComplants;
		}
		else if(key.equalsIgnoreCase("CheckFunctionalityOfPastHistory")){
			return CheckFunctionalityOfPastHistory;
		}
		else if(key.equalsIgnoreCase("CheckFunctionalityOfHistoryOfPresentillness")){
			return CheckFunctionalityOfHistoryOfPresentillness;
		}
		
		else if(key.equalsIgnoreCase("CheckFunctionalityOfRefferalAdvice")){
			return CheckFunctionalityOfRefferalAdvice;
		}
		
		else if(key.equalsIgnoreCase("CheckFunctionalityOfFollowUp")){
			return CheckFunctionalityOfFollowUp;
		}
		
		else if(key.equalsIgnoreCase("CheckFunctionalityofmedicationInPrescriptions")){
			return CheckFunctionalityofmedicationInPrescriptions;
		}
		
		else if(key.equalsIgnoreCase("CheckFunctionalityOfInvesitgationPrescriptions")){
			return CheckFunctionalityOfInvesitgationPrescriptions;
		}
		
		else if(key.equalsIgnoreCase("CheckFunctionalityOfDiagnosisPrescriptions")){
			return CheckFunctionalityOfDiagnosisPrescriptions;
		}
		
		else if(key.equalsIgnoreCase("CheckFunctionalityOfclinicaladvicePrescriptions")){
			return CheckFunctionalityOfclinicaladvicePrescriptions;
		}
		
		
		
		
		
		
		
		
		
		return defaultFun;
	
}}
