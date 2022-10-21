package com.xworkz.hospital;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalDTO dto = new HospitalDTO(1, "jay deva", "KLRAHUL", 1972, "Heart");
		HospitalDTO dto2 = new HospitalDTO(2, "Indraprasth Apollo", "Prathap C.Reddy", 1996, "Cancer");
		HospitalDTO dto3 = new HospitalDTO(3, "Kokilaben Dhirubhai Ambani", "Ambani Foundation", 2006, "Neurologist");
		HospitalDTO dto4 = new HospitalDTO(4, "Bowring and lady curzon", "Dhaval Shah", 1890, "Thyrocare");
		HospitalDTO dto5 = new HospitalDTO(5, "Cloudnine Hospitals", "R.Kishore Kumar", 2007, "neonatologist");
		HospitalDTO dto6 = new HospitalDTO(6, "Narayana hrudayalay ", "Dr.Devi Shetty", 2001, "Cardiac Surgeon");
		HospitalDTO dto7 = new HospitalDTO(7, "Nimhans Hospital", "R.marthanda Varma", 1977, "Neurosurgeon");
		HospitalDTO dto8 = new HospitalDTO(8, "Nethradhama Superspeciality Hospital", "Albert Schweitzer", 2015,
				"Anesthesiologyf");
		HospitalDTO dto9 = new HospitalDTO(9, "Rajarajeswari Hospital", "A.C Shanmugam", 1992, "Neurosurgeon");
		HospitalDTO dto10 = new HospitalDTO(10, "vanivilas Women and Children Hospital", "Bangalore Reasearch Center",
				1935, "Specilast");
		HospitalDTO dto11 = new HospitalDTO(11, "Acura Speciality Hospital", "Dr.Rajaram", 2000, "Diabets");
		HospitalDTO dto12 = new HospitalDTO(12, "Aster CMI Hospital", "Azad Moopen", 1987, "Entrepenur");
		HospitalDTO dto13 = new HospitalDTO(13, "Ayur Vaid Hospital", "Rajiv Vasudeva", 2005, "Ayur Veda");
		HospitalDTO dto14 = new HospitalDTO(14, "Bangalore Baptist Hospital", "Dr.Jasper Mcphail", 1973, "Therpy");
		HospitalDTO dto15 = new HospitalDTO(15, "Bangalore Children’s Hospital", "Prathap C.Reddy", 1996, "Cancer");
		HospitalDTO dto16 = new HospitalDTO(16, "Bangalore Kidney Stone Hospital", "Prathap C.Reddy", 1996, "Cancer");
		HospitalDTO dto17 = new HospitalDTO(17, "Bangalore West Lions Hospital", "Prathap .Reddy", 1996, "Cancer");
		HospitalDTO dto18 = new HospitalDTO(18, "Belaku Eye Hospital", "Prathap C.Reddy", 1996, "Cancer");
		HospitalDTO dto19 = new HospitalDTO(19, "BGS Global Hospital", "Prathap C.", 1994, "Cancer");
		HospitalDTO dto20 = new HospitalDTO(20, "Bhagwan Mahaveer Jain Heart Centre", "Prathap C.Reddy", 1996,
				"Cancer");
		HospitalDTO dto21 = new HospitalDTO(21, "Chinmaya Mission Hospita", "", 1996, "");
		HospitalDTO dto22 = new HospitalDTO(22, "Church of South India Hospital", "", 1996, "");
		HospitalDTO dto23 = new HospitalDTO(23, "City Hospital", "K.Bhaskar", 1987, "dynamic surgeon");
		HospitalDTO dto24 = new HospitalDTO(24, "D.G.Hospital", "D.G Benakappa", 1930, "Surgeon");
		HospitalDTO dto25 = new HospitalDTO(25, "Dayakan Hospital", "", 1996, "");
		HospitalDTO dto26 = new HospitalDTO(26, "Devi Eye Hospital", "", 1996, "");
		HospitalDTO dto27 = new HospitalDTO(27, "Dr. Solanki Eye Hospital", "", 1996, "");
		HospitalDTO dto28 = new HospitalDTO(28, "H.B.S. Hospital", "", 1996, "");
		HospitalDTO dto29 = new HospitalDTO(29, "Hi-tech Kidney Stones Hospital", "", 1996, "");
		HospitalDTO dto30 = new HospitalDTO(30, "Hosmat Hospital", "", 1996, "");
		HospitalDTO dto31 = new HospitalDTO(31, "Jain Dental Centre", "", 1996, "");
		HospitalDTO dto32 = new HospitalDTO(32, "Meenakshi Hospital", "", 1996, "");
		HospitalDTO dto33 = new HospitalDTO(33, "Republic Hospital", "", 1996, "");
		HospitalDTO dto34 = new HospitalDTO(34, "Shree Dhanvanthari Ayurved Hospital", "", 1996, "");
		HospitalDTO dto35 = new HospitalDTO(35, "Sparsha Hospital", "", 1996, "");
		HospitalDTO dto36 = new HospitalDTO(36, "Basaveshwara General Hospital ", "Mahadevappa Rampure", 1989,
				"radiology");
		HospitalDTO dto37 = new HospitalDTO(37, "Neelambika Hospital", "Neelwani", 2001, " local");
		HospitalDTO dto38 = new HospitalDTO(38, "Banashankari", "Dr.Bantanur", 1991, " NeuroSurgey");

		HospitalDTO dto39 = new HospitalDTO(39, "Vydehi Hospital", "D.K Audikeshav naidu", 2000, " Delivery");

		HospitalDTO dto40 = new HospitalDTO(40, "Vydehi Hospital", "Dr.Tippa", 2003, " child ");

		HospitalDTO dto41 = new HospitalDTO(41, "Bantanur Hospital", "Dr.katwa", 2002, " NeuroSurgey");


		HospitalService hospitalService = new HospitalServiceImpl();
		hospitalService.validateAndSave(dto);
		hospitalService.validateAndSave(dto2);
		hospitalService.validateAndSave(dto3);
		hospitalService.validateAndSave(dto4);
		hospitalService.validateAndSave(dto5);
		hospitalService.validateAndSave(dto6);
		hospitalService.validateAndSave(dto7);
		hospitalService.validateAndSave(dto8);
		hospitalService.validateAndSave(dto9);

		hospitalService.validateAndSave(dto10);
		hospitalService.validateAndSave(dto11);
		hospitalService.validateAndSave(dto12);
		hospitalService.validateAndSave(dto13);
		hospitalService.validateAndSave(dto14);
		hospitalService.validateAndSave(dto15);
		hospitalService.validateAndSave(dto16);
		hospitalService.validateAndSave(dto17);

		hospitalService.validateAndSave(dto18);
		hospitalService.validateAndSave(dto19);
		hospitalService.validateAndSave(dto20);
		hospitalService.validateAndSave(dto21);
		hospitalService.validateAndSave(dto22);
		hospitalService.validateAndSave(dto23);
		hospitalService.validateAndSave(dto24);
		hospitalService.validateAndSave(dto25);
		hospitalService.validateAndSave(dto26);
		hospitalService.validateAndSave(dto27);
		hospitalService.validateAndSave(dto28);
		hospitalService.validateAndSave(dto29);
		hospitalService.validateAndSave(dto30);
		hospitalService.validateAndSave(dto31);
		hospitalService.validateAndSave(dto32);
		hospitalService.validateAndSave(dto33);
		hospitalService.validateAndSave(dto34);
		hospitalService.validateAndSave(dto35);
		hospitalService.validateAndSave(dto36);
		hospitalService.validateAndSave(dto37);
		hospitalService.validateAndSave(dto38);
		hospitalService.validateAndSave(dto39);
		hospitalService.validateAndSave(dto40);
		hospitalService.validateAndSave(dto41);

	}

}
