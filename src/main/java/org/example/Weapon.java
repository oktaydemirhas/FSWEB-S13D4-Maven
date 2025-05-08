package org.example;

public enum Weapon {
        SWORD(50, 1.2),
        GUN(30, 2.5),
        AXE(40, 0.9);

        private final int damage;
        private final double attackSpeed;

        Weapon(int damage, double attackSpeed) {
            this.damage = damage;
            this.attackSpeed = attackSpeed;
        }

        public int getDamage() {
            return damage;
        }

        public double getAttackSpeed() {
            return attackSpeed;
        }
}

