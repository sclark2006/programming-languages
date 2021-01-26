#include <iostream>
#include "Cube.h"

int main() {
  Cube cube;

  cube.setLength(3.5);
  double volume = cube.getVolume();
  std::cout << "Volume: " << volume << std::endl;

  return 0;
}
