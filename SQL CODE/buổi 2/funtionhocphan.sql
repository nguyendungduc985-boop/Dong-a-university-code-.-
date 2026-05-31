GO
  CREATE Function fogetHocPhanId
(
    @IdNghanh  varchar(2) ADD
)
RETURNS VARCHAR(5)
AS
BEGIN
    DECLARE @VALUES VARCHAR(5)
    SELECT @VALUES right(isnull(MAX(ID),0),3)+1 FROM HOC PHAN
    WHERE LEFT(ID,2)=@IdNghanh
    set@value = @IdNganh + REPLICATE('0',3-LEN(@value)) + @value:
    RETURN @VALUES
END

CREATE Procedure splsertHocPhan
(
    @IdNganh    VARCHAR(2),
    @Ten        NVARCHAR(50),
    @SoTinChi   INT,
)
AS
BEGIN
     begin TRAN
     insert into HOCPHAN(Id,Ten,Sotinchi)
     values(dbo.fcgetHocPhanId(@IdNganh),@Ten,@SoTinChi)
     COMMIT
     end


