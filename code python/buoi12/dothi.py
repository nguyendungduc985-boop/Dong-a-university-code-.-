import pandas as pd
import matplotlib.pyplot as plt

# 1. Đọc dữ liệu (Thay tên file đúng với file của bạn)
file_path = 'câu trả lời khhảo sát NDD.xlsx - Câu trả lời biểu mẫu 1.csv'
df = pd.read_csv(file_path)

# 2. Làm sạch cột Điểm số (Xử lý dấu phẩy và xóa /10)
def clean_grade(x):
    if pd.isna(x): return 0
    x = str(x).split('/')[0] # Lấy số trước dấu /
    x = x.replace(',', '.')  # Đổi dấu phẩy thành dấu chấm
    return float(x)

df['Diem_So'] = df.iloc[:, -1].apply(clean_grade)

# 3. Tính điểm trung bình Lo lắng (Cột 4 đến 19 là các câu hỏi lo lắng)
# Bạn có thể điều chỉnh index cột tùy theo cấu trúc file thực tế
anxiety_cols = df.columns[3:19] 
df['Mean_Anxiety'] = df[anxiety_cols].mean(axis=1)

# 4. Phân loại mức độ lo lắng để vẽ biểu đồ 3.2.1
def classify(x):
    if x >= 3.5: return 'Cao'
    if x >= 2.5: return 'Trung bình'
    return 'Thấp'

df['Level'] = df['Mean_Anxiety'].apply(classify)

# 5. Tính toán dữ liệu Pareto
data = df['Level'].value_counts().reindex(['Cao', 'Trung bình', 'Thấp'])
percent = (data / data.sum() * 100)
cum_percent = percent.cumsum()

# 6. Vẽ biểu đồ
fig, ax1 = plt.subplots(figsize=(10, 6))

# Vẽ cột (Tần suất)
ax1.bar(data.index, data, color='skyblue', label='Số lượng sinh viên')
ax1.set_ylabel('Số lượng sinh viên')
ax1.set_xlabel('Mức độ lo lắng')

# Vẽ đường tích lũy (Cumulative %)
ax2 = ax1.twinx()
ax2.plot(data.index, cum_percent, color='orange', marker='D', ms=7, label='% Tích lũy')
ax2.set_ylabel('Phần trăm tích lũy (%)')
ax2.set_ylim(0, 110)

# Thêm nhãn % lên đường tích lũy
for i, v in enumerate(cum_percent):
    ax2.annotate(f'{v:.1f}%', (i, v), textcoords="offset points", xytext=(0,10), ha='center')

plt.title('Biểu đồ Pareto: Mức độ lo lắng học phần Nghe 3')
plt.show()