# %%
import pandas as pd
from sklearn.preprocessing import MinMaxScaler
from sklearn.model_selection import train_test_split

#? 1. Cargar los datos
data = pd.read_csv("C:\\Users\\RogSt\\Desktop\\Jupyter\\Unidad_2\\Border_Crossing_Entry_Data.csv")

#? 2. Explorar los datos
#print(data.head())
#print(data.info())
#print(data.describe())

#? 3. Limpieza de datos
# Eliminar duplicados
#data = data.drop_duplicates()

#? Rellenar o eliminar valores faltantes según sea necesario
#data = data.fillna(404, inplace = True)

#? Verificar y ajustar tipos de datos
#data["Port Code"] = data["Port Code"].astype(int)

#? 4. Transformación de datos

#? Convertir variables categóricas a numéricas con One-Hot Encoding
data_encoded = pd.get_dummies(data, columns=['Port Name', 'State', 'Border', 'Measure'], drop_first=True)

#? Normalización de columnas numéricas
scaler = MinMaxScaler()
data_encoded[['Value', 'Latitude', 'Longitude']] = scaler.fit_transform(data_encoded[['Value', 'Latitude', 'Longitude']])

#? 5. División de datos en entrenamiento y prueba

#? Definir las características (X) y la variable objetivo (y)
X = data_encoded.drop(['Value', 'Date', 'Point'], axis=1)
y = data_encoded['Value']

#? División en conjuntos de entrenamiento (80%) y prueba (20%)
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)
# %%
