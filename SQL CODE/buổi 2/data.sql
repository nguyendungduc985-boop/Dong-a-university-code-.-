go
	   create procedure spUpdate_HocPhi_Nganh
	   as			
		    declare x cursor -- Tạo con trỏ x để sử dụng
			for       Select Id  from Nganh
			-- Con trỏ trong trường hợp này là duyệt từng dòng tại cột Id trong kết quả truy vấn ( Select Id  from Nganh)
			Open x 
					Declare @IdNganh varchar(5) 
					Fetch next From x into @IdNganh
						While (@@Fetch_status = 0)
						Begin
								Declare @TongDonGia float 
								select   @TongDonGia = sum(a.DonGia)
								from HocPhan a, ChuongTrinhDaoTao b
								where a.Id=b.HocPhanId 	and b.NganhId=@IdNganh									
								Update Nganh set HocPhi= @TongDonGia, NgayApDung = SYSDATETIMEOFFSET() 
								Where Id= @IdNganh		
								Fetch next From x into @IdNganh
						End
			Close x 
			Deallocate x 		 
		go
	    -- Gọi lại thủ tục  spcursor_update_hoc_phi_nganh
		/*
		drop procedure spcursor_update_hoc_phi_nganh			
		execute spUpdate_HocPhi_Nganh		
		select * from Nganh
		*/








