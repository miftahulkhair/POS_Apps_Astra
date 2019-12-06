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

INSERT INTO pos_mst_category (active, name) VALUES (true, 'pakaian');
INSERT INTO pos_mst_category (active, name) VALUES (true, 'mobil');
INSERT INTO pos_mst_category (active, name) VALUES (true, 'gadget');

INSERT INTO pos_mst_item (active, name, category_id) VALUES (true, 'kemeja', 1);
INSERT INTO pos_mst_item (active, name, category_id) VALUES (true, 'kaos', 1);
INSERT INTO pos_mst_item (active, name, category_id) VALUES (true, 'toyota', 2);
INSERT INTO pos_mst_item (active, name, category_id) VALUES (true, 'hp', 3);

INSERT INTO pos_mst_item_variant (active, name, price, sku, item_id) VALUES (true, 'batik', 150000, 'BTK001', 1);
INSERT INTO pos_mst_item_variant (active, name, price, sku, item_id) VALUES (true, 'Rush', 350000000, 'RSH001', 3);
INSERT INTO pos_mst_item_variant (active, name, price, sku, item_id) VALUES (true, 'iPhone', 20000000, 'IPH001', 4);

INSERT INTO pos_item_inventory (adjustmentQty, alertAtQty, beginning, endingQty, outlet_id, purchaseQty, salesOrderQty, transferStockQty, variant_id) VALUES (5, 2, 5, 5, 1, 3, 3, 2, 1);
INSERT INTO pos_item_inventory (adjustmentQty, alertAtQty, beginning, endingQty, outlet_id, purchaseQty, salesOrderQty, transferStockQty, variant_id) VALUES (10, 2, 10, 10, 2, 5, 5, 2, 2);
INSERT INTO pos_item_inventory (adjustmentQty, alertAtQty, beginning, endingQty, outlet_id, purchaseQty, salesOrderQty, transferStockQty, variant_id) VALUES (20, 2, 20, 20, 3, 5, 5, 5, 3);

INSERT INTO pos_mst_customer (active, address, dob, email, name, phone, province_id, region_id, district_id) VALUES (true, 'jakarta', '2019-12-03 10:48:43.000000', 'bejo@gmail.com', 'bejo', '08191829282', 1, 1, 1);
INSERT INTO pos_mst_customer (active, address, dob, email, name, phone, province_id, region_id, district_id) VALUES (true, 'tangerang', '2019-12-04 10:48:43.000000', 'alif@gmail.com', 'aluf', '082381238712', 2, 2, 2);
INSERT INTO pos_mst_customer (active, address, dob, email, name, phone, province_id, region_id, district_id) VALUES (true, 'bandung', '2019-12-05 10:48:43.000000', 'lala@gmail.com', 'lala', '0812361283611', 3, 3, 3);

INSERT INTO pos_mst_supplier (active, address, email, name, phone, postalCode, province_id, region_id, district_id) VALUES (true, 'jakarta', 'supplier1@gmail.com', 'Supplier 1', '08162686222', '16123', 1, 1, 1);
INSERT INTO pos_mst_supplier (active, address, email, name, phone, postalCode, province_id, region_id, district_id) VALUES (true, 'tangerang', 'supplier2@gmail.com', 'Supplier 2', '08162686211', '15135', 2, 2, 2);
INSERT INTO pos_mst_supplier (active, address, email, name, phone, postalCode, province_id, region_id, district_id) VALUES (true, 'bandung', 'supplier3@gmail.com', 'Supplier 3', '081626862455', '18373', 3, 3, 3);

INSERT INTO pos_t_transfer_stock (fromOutlet, toOutlet, notes, status, modifiedOn) VALUES (1, 2, 'Kirim Gan', 'Created', '2019-12-05');
INSERT INTO pos_t_transfer_stock (fromOutlet, toOutlet, notes, status, modifiedOn) VALUES (3, 1, 'Kirim Gan', 'Approved', '2019-12-05');
INSERT INTO pos_t_transfer_stock (fromOutlet, toOutlet, notes, status, modifiedOn) VALUES (2, 3, 'Kirim Gan', 'Created', '2019-12-05');

INSERT INTO pos_t_transfer_stock_detail (instock, transferQty, transfer_id, variant_id) VALUES (50, 20, 1, 1);
INSERT INTO pos_t_transfer_stock_detail (instock, transferQty, transfer_id, variant_id) VALUES (80, 50, 1, 2);
INSERT INTO pos_t_transfer_stock_detail (instock, transferQty, transfer_id, variant_id) VALUES (100, 30, 2, 2);
INSERT INTO pos_t_transfer_stock_detail (instock, transferQty, transfer_id, variant_id) VALUES (70, 50, 3, 3);

INSERT INTO pos_t_transfer_stock_history (status, transfer_id, createOn) VALUES ('Submitted', 1, '2019-12-05');
INSERT INTO pos_t_transfer_stock_history (status, transfer_id, createOn) VALUES ('Approved', 1, '2019-12-06');
INSERT INTO pos_t_transfer_stock_history (status, transfer_id, createOn) VALUES ('Submitted', 2, '2019-12-07');
INSERT INTO pos_t_transfer_stock_history (status, transfer_id, createOn) VALUES ('Submitted', 3, '2019-12-08');

INSERT INTO pos_t_prcs (createOn, notes, prNo, readyTime, status, outlet_id) VALUES ('2019-12-05', 'PR pertama', 'PR001', '2019-12-05', 'Submitted', 1);
INSERT INTO pos_t_prcs (createOn, notes, prNo, readyTime, status, outlet_id) VALUES ('2019-12-06', 'PR kedua', 'PR002', '2019-12-06', 'Submitted', 2);
INSERT INTO pos_t_prcs (createOn, notes, prNo, readyTime, status, outlet_id) VALUES ('2019-12-07', 'PR ketiga', 'PR003', '2019-12-07', 'Submitted', 3);

-- INSERT INTO pos_t_purchase_request_detail (request_qty, inventory_id, pr_id) VALUES (50, 1, 1);
-- INSERT INTO pos_t_purchase_request_detail (request_qty, inventory_id, pr_id) VALUES (80, 2, 2);
-- INSERT INTO pos_t_purchase_request_detail (request_qty, inventory_id, pr_id) VALUES (100, 3, 3);

INSERT INTO pos_t_po (createOn, grandTotal, notes, poNo, status, outlet_id, pr_id, supplier_id) VALUES ('2019-12-05', 10000000, 'PO pertama', 'PO001', 'Submitted', 1, 1, 1);
INSERT INTO pos_t_po (createOn, grandTotal, notes, poNo, status, outlet_id, pr_id, supplier_id) VALUES ('2019-12-06', 10000000, 'PO kedua', 'PO002', 'Approved', 2, 2, 2);
INSERT INTO pos_t_po (createOn, grandTotal, notes, poNo, status, outlet_id, pr_id, supplier_id) VALUES ('2019-12-07', 10000000, 'PO ketiga', 'PO003', 'Rejected', 3, 3, 3);

INSERT INTO pos_t_purchase_order_detail (inventory_id, po_id, request_qty, sub_total, unit_cost) VALUES (1, 1, 2, 5000000, 200000);
INSERT INTO pos_t_purchase_order_detail (inventory_id, po_id, request_qty, sub_total, unit_cost) VALUES (2, 1, 2, 5000000, 200000);
INSERT INTO pos_t_purchase_order_detail (inventory_id, po_id, request_qty, sub_total, unit_cost) VALUES (3, 2, 5, 7000000, 700000);
INSERT INTO pos_t_purchase_order_detail (inventory_id, po_id, request_qty, sub_total, unit_cost) VALUES (3, 3, 20, 1000000, 100000;

