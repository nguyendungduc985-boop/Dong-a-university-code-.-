CREATE TABLE LoạiSanPham (
    Id VARCHAR (2) PRIMARY KEY,
    Ten navarchar(50)
);

CREATE TABLE SanPham (
    Id VARCHAR (5) PRIMARY KEY,
    LoaiSanPhamId VARCHAR(2),
    Ten NVARCHAR(50),
    DonViTinh NVARCHAR(15),
    SoLuong INT,
    DonGia FLOAT,
    FOREIGN KEY (LoaiSanPhamId) REFERENCES LoaiSanPham(Id)
);

CREATE TABLE XuatHang (
    Id INT PRIMARY KEY,
    TenKhachHang NVARCHAR(100),
    DienThoai VARCHAR(15),
    DiaChi NVARCHAR(100),
    NgayXuat DATETIME,
    TongTien FLOAT,
);

CREATE TABLE ChiTietXuatHang (
    Id int PRIMARY KEY,
    XuatHangId INT,
    SanPhamId VARCHAR(5),
    SoLuong INT,
    DonGia FLOAT,
    FOREIGN KEY (XuatHangId) REFERENCES XuatHang(Id),
    FOREIGN KEY (SanPhamId) REFERENCES SanPham(Id)
);

SELECT
sp.Id AS 'ID sản phẩm',
sp.Ten AS 'Tên Sản Phẩm',
SUM(ctxh.SoLuong) AS 'Tổng số lượng xuất'
FROM SanPham SPACE
JOIN ChiTietXuatHang ctxh ON sp.ID = ctxh.SanPhamID
GROUP BY sp.Id, sp.Ten;

SELECT
xh.DienThoai AS 'điện thoại',
xh.TenKhachHang AS'Tên Khách Hang',
SUM(ctxh.SoLuong) AS 'Tổng Số Lượng Mua'
FROM XuatHang xh
JOIN ChiTietXuatHang ctxh ON xh.Id = ctxh.XuatHangId
WHERE xh.DiaChi LIKE N'%Hà Nội%'
GROUP BY xh.DienThoai, xh.TenKhachHang;

SELECT
sp.id AS 'ID Sản Phẩm',
sp.Ten AS 'Tên Sản Phẩm',
SUM(ctxh.SoLuong) AS 'Tổng số lượng xuất'
FROM SanPham sp
JOIN ChiTietXuatHang ctxh ON sp.id = ctxh.SanPhamId
GROUP BY sp.Id,sp.TEN
HAVING SUM(ctxh.SoLuong) >(
    
    SELECT Sum(ctxh2.SOLuong)
    FROM SanPham sp2
    JOIN ChiTietXuatHang ctxh2 ON sp2.id  = ctxh2.XuayHangId
    WHERE sp2.Ten = 'sắt 10'
);

SELECT DISTINCT
XH.DienThoai AS 'điện thoại',
XH.TenKhachHang AS 'tên khách hàng',
XH.DiaChi AS 'Địa Chỉ'
FROM XuatHnag xh
JOIN ChiTietXuatHang ctxh ON xh.Id = ctxh.XuatHangId
JOIN SanPham sp ON ctxh.SanPhamId = sp.Id
WHERE sp.Ten IN (N'Sắt 10',N'Sắt 8');