cmake_minimum_required(VERSION 3.22)

# 指定项目名称
project(HelloWorld C)

# 指定编译的标准
set(CMAKE_C_STANDARD 99)

# 将编译的结果放到指定的目录下
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR}/target/bin)

# 指定编译的文件
add_executable(HelloWorld client.c)