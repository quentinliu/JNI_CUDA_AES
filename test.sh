nvcc -I/home/ansible/jdk1.8.0_181/include -I/home/ansible/jdk1.8.0_181/include/linux -o cuda_utility.o -c AESstr.cu --compiler-options "-Wall -Wfatal-errors -Ofast -DGPU -fPIC"
g++ -o aescuda.so cuda_utility.o -L/usr/local/cuda-9.0/lib64 -lcuda -lcudart -g -shared -fPIC

