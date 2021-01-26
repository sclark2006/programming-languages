#include "Cube.h"

double Cube::getVolume() {
  return _length * _length * _length;
}

double Cube::getSurfaceArea() {
  return 6 * _length * _length;
}

void Cube::setLength(double length) {
  _length = length;
}
