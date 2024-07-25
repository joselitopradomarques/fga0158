import numpy as np
import matplotlib.pyplot as plt

# Define a função sinc²
def sinc_squared(t):
    return (np.sinc(5 * np.pi * t / np.pi)) ** 2

# Parâmetros de amostragem
fs = 20  # Frequência de amostragem em Hz
t = np.arange(0, 1 + 1/fs, 1/fs)  # Vetor de tempo de 0 a 1 segundo com passo de 1/fs

# Valores amostrados de sinc²(5πt)
sampled_values = sinc_squared(t)

# Imprime os valores amostrados
print("Tempo (s):", t)
print("Valores amostrados:", sampled_values)

# Plotando os valores amostrados
plt.stem(t, sampled_values, use_line_collection=True)
plt.xlabel('Tempo (s)')
plt.ylabel('sinc²(5πt)')
plt.title('Amostragem de sinc²(5πt) a 10 Hz')
plt.grid(True)
plt.show()
