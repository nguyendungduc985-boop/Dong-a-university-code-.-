--Bai3:
/*
Cho lược đồ cơ sở dữ liệu quan hệ như sau:
- LoaiSanPham(Id  varchar(2), Ten  nvarchar(50))
- SanPham(Id  varchar(5), LoaiSanPhamId varchar(2), Ten  nvarchar(50), DonViTinh nvarchar(15), SoLuong int, 
DonGia float)
- NhapHang(Id  int, TenNhaCungCap nvarchar(100), DienThoai varchar(15), DiaChi nvarchar(100), NgayNhap 
datetime, TongTien  float)
- ChiTietNhapHang (Id  int, NhapHangId  int, SanPhamId int, SoLuong, DonGia float)
*/
	go
	create database Bai3
	go
	use Bai3
	go
	--1.	Sử dụng Create table để tạo cấu trúc cho 4 bảng dữ liệu trên.
	create table LoaiSanPham
	(
		Id						varchar(2) primary key,
		Ten					nvarchar(100) unique	
	)
	-- Nhập dữ liệu
	insert into LoaiSanPham(Id, Ten) values('SA', N'Sắt')
	insert into LoaiSanPham(Id, Ten) values('XM', N'Xi măng')
	-- Hiển thị
	select * from LoaiSanPham
	go
	create table SanPham
	(
		Id							varchar(5) primary key,
		LoaiSanPhamId	varchar(2) foreign key references LoaiSanPham(Id),
		Ten						nvarchar(100),
		DonViTinh			nvarchar(15),
		SoLuong				int,
		DonGia				float	
	)
		-- Nhập dữ liệu
	insert into SanPham(Id, LoaiSanPhamId, Ten, DonViTinh, SoLuong, DonGia) values(dbo.fcgetSanPhamId('SA'), 'SA',N'Sắt 6', 'Kg', 100,19000)
	insert into SanPham(Id, LoaiSanPhamId, Ten, DonViTinh, SoLuong, DonGia) values(dbo.fcgetSanPhamId('SA'), 'SA',N'Sắt 8', 'Kg', 100,19000)
	insert into SanPham(Id, LoaiSanPhamId, Ten, DonViTinh, SoLuong, DonGia) values(dbo.fcgetSanPhamId('SA'), 'SA',N'Sắt 10', N'Cây', 100,110000)

	insert into SanPham(Id, LoaiSanPhamId, Ten, DonViTinh, SoLuong, DonGia) values(dbo.fcgetSanPhamId('XM'), 'XM',N'Xi măng Kim Đỉnh', 'Bao', 100,90000)
	insert into SanPham(Id, LoaiSanPhamId, Ten, DonViTinh, SoLuong, DonGia) values(dbo.fcgetSanPhamId('XM'), 'XM',N'Xi măng Hải Vân', 'Bao', 100,80000)

	-- hiển thị dữ liệu
	select * from SanPham
	go

	create table NhapHang
	(
		Id								int identity primary key,
		TenNhaCungCap		nvarchar(100),
		DienThoai				varchar(15),
		DiaChi						nvarchar(100),
		NgayNhap				datetime,
		TongTien					float	
	)

	-- Nhập dữ liệu
	insert into NhapHang(TenNhaCungCap, DienThoai, DiaChi, NgayNhap) values(N'Công ty Hòa Phát','0905123103', N'12 Lê Duẩn, Hồ Chí Minh',GETDATE())
	insert into NhapHang(TenNhaCungCap, DienThoai, DiaChi, NgayNhap) values(N'Công ty Xi măng Kim Đỉnh','0905123104', N'110 Lê Duẩn, Hả Phòng',GETDATE())
	insert into NhapHang(TenNhaCungCap, DienThoai, DiaChi, NgayNhap) values(N'Công ty Xi măng Hải Vân','0905123105', N'10 Lê Duẩn, Đà Nẵng',GETDATE())
	-- Hiển thị
	select * from NhapHang

	create table ChiTietNhapHang
	(
		Id						int identity primary key,
		NhapHangId	int foreign key references NhapHang(Id),
		SanPhamId		varchar(5) foreign key references SanPham(Id),
		SoLuong			int,
		DonGia			float
	)
	-- Nhập dữ liệu
	insert into ChiTietNhapHang(NhapHangId, SanPhamId, SoLuong, DonGia) values(1, 'SA001', 100, 19000)
	insert into ChiTietNhapHang(NhapHangId, SanPhamId, SoLuong, DonGia) values(1, 'SA002', 100, 19000)
    insert into ChiTietNhapHang(NhapHangId, SanPhamId, SoLuong, DonGia) values(1, 'SA003', 200, 110000)

	insert into ChiTietNhapHang(NhapHangId, SanPhamId, SoLuong, DonGia) values(2, 'XM001', 50, 90000)
	insert into ChiTietNhapHang(NhapHangId, SanPhamId, SoLuong, DonGia) values(3, 'XM002', 50, 80000)



	
	go
  /*
  2.	Sử dụng câu lệnh Select để thống kê số lượng nhập gồm các trường: Id sản phẩm, Tên sản phẩm, Tổng số lượng nhập.
  */
	
	/*
	3.	Sử dụng câu lệnh Select để thống kê số lượng bán gồm các trường:  Điện thoại, Tên nhà cung cấp, Tổng số lượng bán
	của những Nhà cung cấp có địa chỉ tại Đà Nẵng.
	*/



	/*
	4.	Sử dụng câu lệnh Select để thống kê số lượng nhập hàng gồm các trường: 
	Id sản phẩm, Tên sản phẩm, Tổng số lượng nhập của những sản phẩm có số lượng nhập lớn hơn số lượng nhập của sản phẩm có tên là sắt 10’.
	*/

	/*
	5.	Sử dụng câu lệnh Select để hiển thị các nhà cung cấp gồm Điện thoai, Tên nhà cung cấp, Địa chỉ cung cấp sản phẩm Sắt 8 và Sắt 6
	*/

	/*
	 6. Tạo Function fcgetSanPhamId để đánh Id tự động cho bảng SanPham, Id sản phẩm có dạng: DT001, DT002, MT001, MT002,...
	 Lưu ý: Id sản phẩm có 5 ký tự: 2 ký tự đầu là mã loại sản phẩm, 3 ký tự sau là số thứ tự
	*/
	-- drop function fcgetSanPhamId
		create function fcgetSanPhamId
			(
				@IdLoaiSanPham			varchar(2)
			)
			returns varchar(5)
			as
			Begin
					declare @value varchar(5);
					select @value= right(isnull(MAX(Id),0),3)+ 1 from SanPham where Left(Id,2)=@IdLoaiSanPham;		
					set @value= @IdLoaiSanPham + Replicate('0',3-LEN(@value))+@value;
					return @value;
			End
		go
	/*
	-- Gọi lại function fcgetSanPhamId	
	  select id=dbo.fcgetSanPhamId('DT')		
	  select * from SanPham
	*/
	--7.Tạo thủ tục để thêm, sửa, xóa cho bảng SanPham, mỗi thủ tục phải có tham số tương ứng với các thuộc tính của bảng. 
	--Lưu ý có sử dụng transaction và đối với thủ tục thêm mới Id được lấy từ function fcgetSanPhamId.
		-- Thủ tục thêm mới
		-- drop procedure  spInsertSanPham
		
		-- Sửa thủ tục
		-- drop procedure  spUpdateSanPham
			


		-- Xóa
		--  drop procedure  spDeleteSanPham
	
	/*
	 8.	Tạo trigger với trigger_insert_ChiTietNhapHang sẽ kích hoạt khi ta nhập mới một bản ghi cho bảng ChiTietNhapHang, sau khi 
	 thêm mới thành công cho bảng ChiTietNhapHang thì trigger này tăng số lượng cho bảng SanPham bằng số lượng nhập tương ứng.
	*/
	go 
	create trigger trigger_insert_ChiTietNhapHang
	on ChiTietNhapHang for Insert 
	as
	Begin
			declare @SoLuongTon int 
			declare @SoLuongNhap int
			declare @SanPhamId varchar(5) 
			select @SoLuongNhap= SoLuong , @SanPhamId=SanPhamId  from inserted
			select @SoLuongTon= SoLuong  from SanPham  where Id = @SanPhamId			
			
			update SanPham set SoLuong = @SoLuongTon + @SoLuongNhap
			where Id= @SanPhamId
			print N'Nhập hàng thành công' 
	End
go 
	--9. Sử dụng con trỏ để tạo thủ tục cập nhật TongTien cho bảng NhapHang.
	   go
	   create procedure spUpdate_TongTien_NhapHang
	   as			
		    declare x cursor -- Tạo con trỏ x để sử dụng
			for       Select Id  from NhapHang
			-- Con trỏ trong trường hợp này là duyệt từng dòng tại cột Id trong kết quả truy vấn ( Select Id  from NhapHang)
			Open x 
					Declare @IdPhieuNhap int
					Fetch next From x into @IdPhieuNhap
						While (@@Fetch_status = 0)
						Begin
								Declare @TongTien float 
								select   @TongTien = sum(a.DonGia * a.SoLuong)
								from ChiTietNhapHang a, SanPham b
								where a.SanPhamId= b.Id and a.NhapHangId=@IdPhieuNhap								
								Update NhapHang set TongTien = @TongTien where Id=@IdPhieuNhap									
								Fetch next From x into @IdPhieuNhap
						End
			Close x 
			Deallocate x 		 
		go
		-- Gọi lại thủ tục  spUpdate_TongTien_NhapHang
		/*
		drop procedure spUpdate_TongTien_NhapHang		
		execute  spUpdate_TongTien_NhapHang	
		select * from NhapHang
		*/
