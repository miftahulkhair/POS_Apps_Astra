INSERT INTO pos_mst_role (active, description, name) VALUES (true, 'Grant all access', 'Role Administrator');
INSERT INTO pos_mst_role (active, description, name) VALUES (true, 'Grant cashier access', 'Role Cashier');
INSERT INTO pos_mst_role (active, description, name) VALUES (true, 'Grant back office access', 'Role Back Office');

INSERT INTO pos_mst_employee (active, email, firstName, haveAccount , lastName, title) VALUES (true, 'miftah@gmail.com', 'Miftahul', true,'Khair', 'Mr.');
INSERT INTO pos_mst_employee (active, email, firstName, haveAccount , lastName, title) VALUES (true, 'syifa@gmail.com', 'Syifa', true, 'Tri', 'Mrs.');
INSERT INTO pos_mst_employee (active, email, firstName, haveAccount , lastName, title) VALUES (true, 'al@gmail.com', 'al', true, 'eldul', 'Mr.');
INSERT INTO pos_mst_employee (active, email, firstName, haveAccount , lastName, title) VALUES (true, 'ergon@gmail.com', 'Ergon', true, 'Nogre', 'Mr.');

INSERT INTO pos_mst_province (active, name) VALUES (true, 'DKI Jakarta');
INSERT INTO pos_mst_province (active, name) VALUES (true, 'Banten');
INSERT INTO pos_mst_province (active, name) VALUES (true, 'Jawa Barat');

INSERT INTO pos_mst_region (active, name, province_id) VALUES (true, 'Jakarta Pusat', 1);
INSERT INTO pos_mst_region (active, name, province_id) VALUES (true, 'Tangerang', 2);
INSERT INTO pos_mst_region (active, name, province_id) VALUES (true, 'Bandung', 3);

INSERT INTO pos_mst_district (active, name, region_id) VALUES (true, 'Kemayoran', 1);
INSERT INTO pos_mst_district (active, name, region_id) VALUES (true, 'Cikokol', 2);
INSERT INTO pos_mst_district (active, name, region_id) VALUES (true, 'Cimahi', 3);


INSERT INTO pos_mst_outlet (active, address, email, name, phone, postalCode, province_id, region_id, district_id) VALUES (true, 'Jl.Kemayoran No.1', 'kemayoran.outlet@gmail.com', 'Kemayoran Outlet', '08219372133', '16272', 1, 1, 1);
INSERT INTO pos_mst_outlet (active, address, email, name, phone, postalCode, province_id, region_id, district_id) VALUES (true, 'Jl.Cikokol No.19', 'cikokol.outlet@gmail.com', 'Cikokol Outlet', '08321321313', '16323', 2, 2, 2);
INSERT INTO pos_mst_outlet (active, address, email, name, phone, postalCode, province_id, region_id, district_id) VALUES (true, 'Jl.Cimahi No.30', 'cimahi.outlet@gmail.com', 'Cimahi Outlet', '08323234494', '17393', 3, 3, 3);

INSERT INTO pos_employee_outlet (employee_id, outlet_id) VALUES (1, 1);
INSERT INTO pos_employee_outlet (employee_id, outlet_id) VALUES (2, 2);
INSERT INTO pos_employee_outlet (employee_id, outlet_id) VALUES (3, 3);
INSERT INTO pos_employee_outlet (employee_id, outlet_id) VALUES (4, 1);

INSERT INTO pos_mst_user (active, password, username, employee_id, role_id) VALUES (true, '123', 'miftah', 1, 1);
INSERT INTO pos_mst_user (active, password, username, employee_id, role_id) VALUES (true, '123', 'syifa', 2, 2);
INSERT INTO pos_mst_user (active, password, username, employee_id, role_id) VALUES (true, '123', 'al', 3, 3);
INSERT INTO pos_mst_user (active, password, username, employee_id, role_id) VALUES (true, '123', 'ergon', 4, 2);



