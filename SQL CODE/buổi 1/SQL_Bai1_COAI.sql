	-- Bài 1_mau
	-- Cho lược đồ cơ sở dữ liệu quan hệ như sau:
	--	Nganh (Id  varchar(2), Ten  nvarchar(50), HocPhi  float, NgayApDung datetime)
	-- HocPhan (Id  varchar(5), Ten  nvarchar(50), SoTinChi  int, DonGia float, NgayApDung datetime)
	--	DonGiaHocPhan (Id  int, HocPhanId  varchar(5), DonGia  float, NgayApDung datetime, ApDung bit)
	--	ChuongTrinhDaoTao (Id  int, NganhId  varchar(2), HocPhanId varchar(5))
	-- Yêu cầu:
	--1.	Sử dụng Create table để tạo cấu trúc cho 4 bảng dữ liệu trên. 
	--2.	Sử dụng câu lệnh Select để liệt kê các học phần thuộc ngành Công nghệ thông tin 
	--3.	Sử dụng câu lệnh Select để liệt kê các học phần đều học ở ngành Công nghệ thông tin và ngành Kế toán doanh nghiệp
	--4.	Hãy thống kê số Tổng số tín chỉ theo từng ngành đào tạo, bao gồm các trường: Tên ngành, Tổng số tín chỉ 
	--5.	Sử dụng câu lệnh Select để hiển thị các học phần không nằm trong chương trình đào tạo 
	-- Giải:
	--1.	Sử dụng Create table để tạo cấu trúc cho 4 bảng dữ liệu trên

	--  Tạo CSDL Bai1_mau
	create database Bai1_mau
	go
	--  Mở CSDL Bai1_mau
	use Bai1_mau
	go
	--   1.a. Tạo bảng Nganh (Id  varchar(2), Ten  nvarchar(50), HocPhi  float, 
	-- NgayApDung datetime)
	create table  Nganh
	(
		Id						varchar(2) primary key,
		Ten					nvarchar(50),
		HocPhi			float,
		NgayApDung	datetime
	)
	-- Nhập dữ liệu
	insert into Nganh(Id, Ten) values('IT', N'Công nghệ thông tin')
	insert into Nganh(Id, Ten) values('KT', N'Kế toán doanh nghiệp')
	insert into Nganh(Id, Ten) values('XD', N'Xây dựng dân dụng')
	-- Hiển thị dữ liệu
	select * from Nganh
	go
	--1.b. HocPhan (Id  varchar(5), Ten  nvarchar(50), SoTinChi  int, DonGia float, 
	--NgayApDung datetime)
	create table HocPhan
	(
		Id						varchar(5) primary key,
		Ten					nvarchar(50),
		SoTinChi			int,
		DonGia			float,
		NgayApDung	datetime
	)
	insert into HocPhan(Id , Ten) values ('IT001', N'Kỹ thuật lập trình')
	insert into HocPhan(Id , Ten) values ('IT002', N'Cơ sở dữ liệu')
	insert into HocPhan(Id , Ten) values ('IT003', N'Lập trình giao diện web')

	insert into HocPhan(Id , Ten) values ('KT001', N'Nguyên lý kế toán ')
	insert into HocPhan(Id , Ten) values ('KT002', N'Kinh tế vi mô')
	insert into HocPhan(Id , Ten) values ('KT003', N'Kinh tế vĩ mô')

	insert into HocPhan(Id , Ten) values ('CB001', N'Chủ nghĩa xã hội khoa học')
	insert into HocPhan (Id , Ten) values ('CB002', N'Tư tưởng Hồ Chí Minh ')
	
