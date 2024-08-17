package com.vishal.CustomPattern;

public class Alphabet {

    void selectLetterPattern(char let) {
        if (let == 'a') {
            a();
        } else if (let == 'b') {
            b();
        } else if (let == 'c') {
            c();
        } else if (let == 'd') {
            d();
        } else if (let == 'e') {
            e();
        }  else if (let == 'f') {
            f();
        }  else if (let == 'g') {
            g();
        }
        else if (let == 'h') {
            h();
        }  else if (let == 'i') {
            i();
        } else if (let == 'j') {
            j();
        } else if (let == 'k') {
            k();
        }  else if (let == 'l') {
            l();
        } else if (let == 'm') {
            m();
        }  else if (let == 'n') {
            n();
        } else if (let == 'o') {
            o();
        }  else if (let == 'p') {
            p();
        }  else if (let == 'q') {
            q();
        }  else if (let == 'r') {
            r();
        } else if (let == 's') {
            s();
        }  else if (let == 't') {
            t();
        }  else if (let == 'u') {
            u();
        }  else if (let == 'v') {
            v();
        }  else if (let == 'w') {
            w();
        }  else if (let == 'x') {
            x();
        }  else if (let == 'y') {
            y();
        }  else if (let == 'z') {
            z();
        }
        else {
            System.out.println();
            System.out.println("There is no such character found!");
        }
    }

    // A patter method
    private void a() {
        for(int i=0;i<7;i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 && i != 0 || j == 4 && i != 0 || i == 0 && j != 0 && j != 4 || i == 3)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // B patter method
    private void b() {
        for(int i=0; i<7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 && i != 0 && i != 3 && i != 6 || i == 0 && j != 4 || i == 3 && j != 4 || i == 6 && j != 4)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // C patter method
    private void c() {
        for (int row=0; row<5; row++) {
            for (int col=0; col<4; col++) {
                if (row==0 || col==0 || row==4) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // D patter method
    private void d() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==0 || i==0 && j!=4 || j==4 && i!=0 && i!=6 || i==6 && j!=4 )
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // E patter method
    private void e() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==0 || i==0 || i==3 || i==6)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // F patter method
    private void f() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==0 || i==0 || i==3)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // G pattern method
    private void g() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j == 0 || i == 0 || i == 6 || i == 3 && j != 1 && j != 2 || j == 4 && i != 1 && i != 2)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // H pattern method
    private void h() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==0 || i==3 || j==4)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // I pattern method
    private void i() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==2 || i==0 || i==6)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // J patter method
    private void j() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==2 || i==0 || i==6 && j!=3 && j!=4 || i==5 && j!=3 && j!=4 && j!=1)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


    // K patter method
    private void k() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==0 || j+i==4 || j-i==-2)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // L patter method
    private void l() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==0 || i==6)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // M pattern method
    private void m() {
        System.out.println("Currently M is not  working!");
    }

    // N pattern method
    private void n() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<7;j++) {
                if(j==0 || j-i==0 || j==6)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // O patter method
    private void o() {
        for (int row=0; row<5; row++) {
            for (int col=0; col<5; col++) {
                if (row==0 || col==0 || row==4 || col==4) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // P pattern method
    private void p() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==0 && i!=0 || i==0 && j!=0 && j!=4 || j==4 && i!=0 && i<=2 || i==3 && j!=4)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Q pattern method
    private void q() {
        for (int row=0; row<4; row++) {
            for (int col=0; col<3; col++) {
                if (row==0 || col==0 || row==3 || col==2) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    // R pattern method
    private void r() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==0 && i!=0 || i==0 && j!=0 && j!=4 || j==4 && i!=0 && i!=3 || i==3 && j!=4)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }


    // S patter method
    private void s() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==0 && i<=3 || i==0 || i==3 || i==6 || j==4 && i>=4)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // T pattern method
    private void t() {
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (i==0 || j==2) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //U pattern method
    private void u() {
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (j==0 || j==4 || i==4) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // V pattern method
    private void v() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<13;j++) {
                if(j-i==0 || j+i==12 )
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // W pattern method
    private void w() {
        for(int i=0;i<4;i++) {
            for(int j=0;j<7;j++) {
                if(j==0 || j+i==3 || j-i==3 || j==6 )
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // X pattern method
    private void x() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<7;j++) {
                if(j-i==0 || j+i==6)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Y pattern method
    private void y() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<7;j++) {
                if(j-i==0 && i<=3|| j+i==6 && i<=3 || j==3 && i>=3)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Z pattern method
    private void z() {
        for(int i=0;i<7;i++) {
            for(int j=0;j<7;j++) {
                if(i==0 || j+i==6 || i==6)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //class end...
}