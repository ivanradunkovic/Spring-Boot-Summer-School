/*
INSERT INTO doctor (ID, FIRST_NAME, LAST_NAME, DOCTOR_EXPERTISE) VALUES (1, 'Gregory', 'House', 'Nefrologist');
INSERT INTO doctor (ID, FIRST_NAME, LAST_NAME, DOCTOR_EXPERTISE) VALUES (2, 'Leonard H.', 'McCoy', 'Chief medical officer');
INSERT INTO doctor (ID, FIRST_NAME, LAST_NAME, DOCTOR_EXPERTISE) VALUES (3, 'John', 'Carter', 'Emergency Medicine');
INSERT INTO doctor (ID, FIRST_NAME, LAST_NAME, DOCTOR_EXPERTISE) VALUES (4, 'John', 'Dorian', 'Internist');
INSERT INTO doctor (ID, FIRST_NAME, LAST_NAME, DOCTOR_EXPERTISE) VALUES (5, 'Doogie', 'Howser', 'Child doctor - not a pediatrician');
INSERT INTO symptom (ID, DESCRIPTION) VALUES (1, 'Coughing');
INSERT INTO symptom (ID, DESCRIPTION) VALUES (2, 'Fever');
INSERT INTO symptom (ID, DESCRIPTION) VALUES (3, 'Headaches');
INSERT INTO symptom (ID, DESCRIPTION) VALUES (4, 'Nausea');
INSERT INTO symptom (ID, DESCRIPTION) VALUES (5, 'Abdominal pain');
INSERT INTO patient (ID, FIRST_NAME, LAST_NAME, EMAIL, AGE, PHONE_NUMBER, ENLISTMENT_DATE, STATUS) VALUES (1, 'Ivan', 'Radunković', 'ivan@email.com', '32', '0991234567','2018-11-11', 'Cured');
INSERT INTO patient (ID, FIRST_NAME, LAST_NAME, EMAIL, AGE, PHONE_NUMBER, ENLISTMENT_DATE, STATUS) VALUES (2, 'Marko', 'Marić', 'markom1@email.com', '47', '0957826140','2017-01-05', 'Cured');
INSERT INTO patient (ID, FIRST_NAME, LAST_NAME, EMAIL, AGE, PHONE_NUMBER, ENLISTMENT_DATE, STATUS) VALUES (3, 'John', 'Malkovich', 'jm01@gmail.com', '66', '057123478', '1988-01-25', 'Enlisted');
INSERT INTO patient (ID, FIRST_NAME, LAST_NAME, EMAIL, AGE, PHONE_NUMBER, ENLISTMENT_DATE, STATUS) VALUES (4, 'Mary', 'Clinton', 'clintonm@yahoo.com', '21', '57312641', '2019-12-31', 'Diagnosed');
INSERT INTO patient (ID, FIRST_NAME, LAST_NAME, EMAIL, AGE, PHONE_NUMBER, ENLISTMENT_DATE, STATUS) VALUES (5, 'John', 'Doe', 'unknown123@hotmail.com', '99', '12345678', '2005-06-18', 'Under thretmant');
INSERT INTO records (ID, PATIENT_ID, DIAGNOSIS, TREATMENT) VALUES (1, 1, 'Laryngitis', 'Acute laryngitis often gets better on its own within a week or so. Self-care measures, such as voice rest, drinking fluids and humidifying your air, also can help improve symptoms.');
INSERT INTO records (ID, PATIENT_ID, DIAGNOSIS, TREATMENT) VALUES (2, 2, 'Influenza', 'Usually, youll need nothing more than bed rest and plenty of fluids to treat the flu. But if you have severe infection or are at higher risk for complications, your doctor may prescribe an antiviral medication.');
INSERT INTO records (ID, PATIENT_ID, DIAGNOSIS, TREATMENT) VALUES (3, 3, 'Migraine', 'f you have migraines or a family history of migraines, a doctor trained in treating headaches (neurologist) will likely diagnose migraines based on your medical history, symptoms, and a physical and neurological examination.');
INSERT INTO records (ID, PATIENT_ID, DIAGNOSIS, TREATMENT) VALUES (4, 4, 'Sunstroke', 'Heatstroke treatment centers on cooling your body to a normal temperature to prevent or reduce damage to your brain and vital organs.');
INSERT INTO records (ID, PATIENT_ID, DIAGNOSIS, TREATMENT) VALUES (5, 5, 'Appendicitis', 'Appendicitis treatment usually involves surgery to remove the inflamed appendix. Before surgery you may be given a dose of antibiotics to treat infection.');
INSERT INTO history (ID, NEW_STATUS, OLD_STATUS, TREATMENT_REMARK, DOCTOR_ID, PATIENT_ID) VALUES (1, 'Diagnosed', 'Under diagnosis', 'Tests take time. Treatments quicker.', 1, 5);
INSERT INTO history (ID, NEW_STATUS, OLD_STATUS, TREATMENT_REMARK, DOCTOR_ID, PATIENT_ID) VALUES (2, 'Cured', 'Enlisted', 'What am I, a doctor or a moon shuttle conductor?', 2, 4);
INSERT INTO history (ID, NEW_STATUS, OLD_STATUS, TREATMENT_REMARK, DOCTOR_ID, PATIENT_ID) VALUES (3, 'Cured', 'Diagnosed', 'Ive given it a lot of thought, and Ive decided to be spontaneous', 3, 3);
INSERT INTO history (ID, NEW_STATUS, OLD_STATUS, TREATMENT_REMARK, DOCTOR_ID, PATIENT_ID) VALUES (4, 'Under threatment', 'Enlisted', 'You just have to remember, that even if things are changing all around you, deep down youre still the same person.', 4, 2);
INSERT INTO history (ID, NEW_STATUS, OLD_STATUS, TREATMENT_REMARK, DOCTOR_ID, PATIENT_ID) VALUES (5, 'Enlisted', 'Cured', 'Thats the most disgusting thing Ive ever seen, and Im a doctor!', 5, 1);
*/
