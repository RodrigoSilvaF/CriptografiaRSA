from matplotlib import pyplot as plt

lista = [3.434,5.131,6.285,5.285,7.772,0.424,4.932,8.912,2.745,7.048]
soma = sum(lista)/10
print(soma)
i = 64

plt.plot([64,128,192,256,320,384,448,512,576,640,704,768,832,896,960,1024,1088,1152,1216,1280,1344,1408,1472,1536,1600,1664,1728,1792,1856,1984,2048],[0.013000000000000003,0.016100000000000003,0.019700000000000006,0.026600000000000002,0.029900000000000003,0.042,0.046100000000000016,0.0524,0.0816,0.08560000000000001,0.1234,0.18540000000000006,0.2351,0.2548,0.3387,0.43010000000000004,0.55,0.7356,0.8371000000000001,0.9921000000000001,0.9953999999999998,2.2622999999999900,2.353,2.7420999999999900, 2.7444,3.0939,3.5645000000000000,3.635,3.7886,  4.311099999999990,5.1968])
plt.xlabel('BitLengh')
plt.ylabel('Duração (s)')
plt.title('Geração de Chave')
plt.show()