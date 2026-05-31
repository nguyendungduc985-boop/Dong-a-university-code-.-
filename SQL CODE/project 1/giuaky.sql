    CREATE TABLE LoaiSanPham (
    Id varchar(2) PRIMARY KEY,
    Ten nvarchar(50)
);

CREATE TABLE SanPham (
    Id varchar(5) PRIMARY KEY,
    LoaiSanPhamId varchar(2),
    Ten nvarchar(50),
    DonViTinh nvarchar(15),
    SoLuong int,
    DonGia float,
    FOREIGN KEY (LoaiSanPhamId) REFERENCES LoaiSanPham(Id)
);

CREATE TABLE XuatHang (
    Id int PRIMARY KEY,
    TenKhachHang nvarchar(100),
    DienThoai varchar(15),
    DiaChi nvarchar(100),
    NgayXuat datetime,
    TongTien float
);

CREATE TABLE ChiTietXuatHang (
    Id int PRIMARY KEY,
    XuatHangId int,
    SanPhamId varchar(5),
    SoLuong int,
    DonGia float,
    FOREIGN KEY (XuatHangId) REFERENCES XuatHang(Id),
    FOREIGN KEY (SanPhamId) REFERENCES SanPham(Id)
);

SELECT 
    sp.Id AS 'Id sản phẩm', 
    sp.Ten AS 'Tên sản phẩm', 
    SUM(ctxh.SoLuong) AS 'Tổng số lượng xuất'
FROM SanPham sp
JOIN ChiTietXuatHang ctxh ON sp.Id = ctxh.SanPhamId
GROUP BY sp.Id, sp.Ten;

SELECT 
    xh.DienThoai AS 'Điện thoại', 
    xh.TenKhachHang AS 'Tên khách hàng', 
    SUM(ctxh.SoLuong) AS 'Tổng số lượng mua'
FROM XuatHang xh
JOIN ChiTietXuatHang ctxh ON xh.Id = ctxh.XuatHangId
WHERE xh.DiaChi LIKE N'%Đà Nẵng%'
GROUP BY xh.DienThoai, xh.TenKhachHang;

SELECT 
    sp.Id AS 'Id sản phẩm', 
    sp.Ten AS 'Tên sản phẩm', 
    SUM(ctxh.SoLuong) AS 'Tổng số lượng xuất'
FROM SanPham sp
JOIN ChiTietXuatHang ctxh ON sp.Id = ctxh.SanPhamId
GROUP BY sp.Id, sp.Ten
HAVING SUM(ctxh.SoLuong) > (

    SELECT SUM(ctxh2.SoLuong)
    FROM SanPham sp2
    JOIN ChiTietXuatHang ctxh2 ON sp2.Id = ctxh2.SanPhamId
    WHERE sp2.Ten = N'sắt 10'
);

SELECT DISTINCT 
    xh.DienThoai AS 'Điện thoại', 
    xh.TenKhachHang AS 'Tên khách hàng', 
    xh.DiaChi AS 'Địa chỉ'
FROM XuatHang xh
JOIN ChiTietXuatHang ctxh ON xh.Id = ctxh.XuatHangId
JOIN SanPham sp ON ctxh.SanPhamId = sp.Id
WHERE sp.Ten IN (N'Sắt 10', N'Sắt 8');