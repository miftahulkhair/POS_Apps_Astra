INSERT INTO pos_mst_role (active, description, name) VALUES (1, 'Grant all access', 'Role Administrator');
INSERT INTO pos_mst_role (active, description, name) VALUES (1, 'Grant cashier access', 'Role Cashier');
INSERT INTO pos_mst_role (active, description, name) VALUES (1, 'Grant back office access', 'Role Back Office');

INSERT INTO pos_mst_employee (active, email, firstName, haveAccount , lastName, title) VALUES (1, 'miftah@gmail.com', 'Miftahul', 0 ,'Khair', 'Mr.');
INSERT INTO pos_mst_employee (active, email, firstName, haveAccount , lastName, title) VALUES (1, 'syifa@gmail.com', 'Syifa', 0, 'Tri', 'Mrs.');
INSERT INTO pos_mst_employee (active, email, firstName, haveAccount , lastName, title) VALUES (1, 'al@gmail.com', 'al', 0, 'eldul', 'Mr.');
INSERT INTO pos_mst_employee (active, email, firstName, haveAccount , lastName, title) VALUES (1, 'ergon@gmail.com', 'Ergon', 0, 'Nogre', 'Mr.');

INSERT INTO pos_mst_province (active, name) VALUES (1, 'DKI Jakarta');
INSERT INTO pos_mst_province (active, name) VALUES (1, 'Banten');
INSERT INTO pos_mst_province (active, name) VALUES (1, 'Jawa Barat');

INSERT INTO pos_mst_region (active, name, province_id) VALUES (1, 'Jakarta Pusat', 1);
INSERT INTO pos_mst_region (active, name, province_id) VALUES (1, 'Tangerang', 2);
INSERT INTO pos_mst_region (active, name, province_id) VALUES (1, 'Bandung', 3);

INSERT INTO pos_mst_district (active, name, region_id) VALUES (1, 'Kemayoran', 1);
INSERT INTO pos_mst_district (active, name, region_id) VALUES (1, 'Cikokol', 2);
INSERT INTO pos_mst_district (active, name, region_id) VALUES (1, 'Cimahi', 3);


INSERT INTO pos_mst_outlet (active, address, email, name, phone, postalCode, province_id, region_id, district_id) VALUES (1, 'Jl.Kemayoran No.1', 'kemayoran.outlet@gmail.com', 'Kemayoran Outlet', '08219372133', '16272', 1, 1, 1);
INSERT INTO pos_mst_outlet (active, address, email, name, phone, postalCode, province_id, region_id, district_id) VALUES (1, 'Jl.Cikokol No.19', 'cikokol.outlet@gmail.com', 'Cikokol Outlet', '08321321313', '16323', 2, 2, 2);
INSERT INTO pos_mst_outlet (active, address, email, name, phone, postalCode, province_id, region_id, district_id) VALUES (1, 'Jl.Cimahi No.30', 'cimahi.outlet@gmail.com', 'Cimahi Outlet', '08323234494', '17393', 3, 3, 3);

-- INSERT INTO pos_employee_outlet (employee_id, outlet_id) VALUES (1, 1);
-- INSERT INTO pos_employee_outlet (employee_id, outlet_id) VALUES (2, 2);
-- INSERT INTO pos_employee_outlet (employee_id, outlet_id) VALUES (3, 3);
-- INSERT INTO pos_employee_outlet (employee_id, outlet_id) VALUES (4, 1);



