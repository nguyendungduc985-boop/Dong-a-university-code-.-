
CREATE DATABASE HocPhan
(
id             varchar(5)primary key,
Ten            nvarchar(50),
SoTinChi       int,
DonGia         float,
NgayApDung     datetime
)
GO
INSERT INTO HocPhan (Id, Ten) VALUES ('IT001', N'Kỹ thuật lập trình')
INSERT INTO HocPhan (Id, Ten) VALUES ('IT002', N'Cơ sở dữ liệu')
INSERT INTO HocPhan (Id, Ten) VALUES ('IT003', N'Lập trình giao diện web')

INSERT INTO HocPhan (Id, Ten) VALUES ('KT001', N'Nguyên lý kế toán ')
INSERT INTO HocPhan (Id, Ten) VALUES ('KT002', N'Kinh tế vi mô')
INSERT INTO HocPhan (Id, Ten) VALUES ('KT003', N'Kinh tế vĩ mô')    

INSERT INTO HocPhan (Id, Ten) VALUES ('CB001', N'Chủ nghĩa xã hội khoa học')
INSERT INTO HocPhan (Id, Ten) VALUES ('CB002', N'Tư tưởng Hồ Chí Minh ')
GO
--nhập dữ liệu