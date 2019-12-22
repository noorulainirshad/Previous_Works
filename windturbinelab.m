%Noorulain Irshad

run1 = fopen('P:\Eng-10\Irshad\turbinerun1.txt', 'r');
run2 = fopen('P:\Eng-10\Irshad\turbinerun2.txt', 'r');
run3 = fopen('P:\Eng-10\Irshad\turbinerun3.txt', 'r');
run4 = fopen('P:\Eng-10\Irshad\turbinerun4.txt', 'r');

%code i used to find how long each column was:
%len1=length(ia1)42
%len2=length(ia2)60
%len3=length(ia3)51
%len4=length(ia4)56

%current and voltage
ia11 = r1(:,6);
ia22 = r2(:,6);
ia33 = r3(:,6);
ia44 = r4(:,6);

ib11 = r1(:,8);
ib22 = r2(:,8);
ib33 = r3(:,8);
ib44 = r4(:,8);

ic11 = r1(:,10);
ic22 = r2(:,10);
ic33 = r3(:,10);
ic44 = r4(:,10);

va11 = r1(:,5);
va22 = r2(:,5);
va33 = r3(:,5);
va44 = r4(:,5);

vb11 = r1(:,7);
vb22 = r2(:,7);
vb33 = r3(:,7);
vb44 = r4(:,7);

vc11 = r1(:,9);
vc22 = r2(:,9);
vc33 = r3(:,9);
vc44 = r4(:,9);

%lists to add calculated power to an array
powera1 = [];
powerb1 = [];
powerc1 = [];
tp1 = [];

powera2 = [];
powerb2 = [];
powerc2 = [];
tp2 = [];

powera3 = [];
powerb3 = [];
powerc3 = [];
tp3 = [];

powera4 = [];
powerb4 = [];
powerc4 = [];
tp4 = [];

%calculating powers
for i = 1:42
    ia1 = r1(i,6);
    ib1 = r1(i,8);
    ic1 = r1(i,10);
    va1 = r1(i,5);
    vb1 = r1(i,7);
    vc1 = r1(i,9);
    powera1(i) = mypower(ia1,va1);  
    powerb1(i) = mypower(ib1,vb1);
    powerc1(i) = mypower(ic1,vc1); 
    tp1(i) = mytotalpower(mypower(ia1,va1),mypower(ib1,vb1),mypower(ic1,vc1));%#ok<*SAGROW>
end

for i = 1:60
    ia2 = r2(i,6);
    ib2 = r2(i,8);
    ic2 = r2(i,10);
    va2 = r2(i,5);
    vb2 = r2(i,7);
    vc2 = r2(i,9);
    powera2(i) = mypower(ia2,va2);  
    powerb2(i) = mypower(ib2,vb2);
    powerc2(i) = mypower(ic2,vc2); 
    tp2(i) = mytotalpower(mypower(ia2,va2),mypower(ib2,vb2),mypower(ic2,vc2));
end

for i = 1:51
    ia3 = r3(i,6);
    ib3 = r3(i,8);
    ic3 = r3(i,10);
    va3 = r3(i,5);
    vb3 = r3(i,7);
    vc3 = r3(i,9);
    powera3(i) = mypower(ia3,va3);  
    powerb3(i) = mypower(ib3,vb3);
    powerc3(i) = mypower(ic3,vc3); 
    tp3(i) = mytotalpower(mypower(ia3,va3),mypower(ib3,vb3),mypower(ic3,vc3));
end

for i = 1:56
    ia4 = r4(i,6);
    ib4 = r4(i,8);
    ic4 = r4(i,10);
    va4 = r4(i,5);
    vb4 = r4(i,7);
    vc4 = r4(i,9);
    powera4(i) = mypower(ia4,va4);  
    powerb4(i) = mypower(ib4,vb4);
    powerc4(i) = mypower(ic4,vc4); 
    tp4(i) = mytotalpower(mypower(ia4,va4),mypower(ib4,vb4),mypower(ic4,vc4));%#ok<*SAGROW>
end

time1 = 1:42;
time2 = 1:60;
time3 = 1:51;
time4 = 1:56;

figure(1)
plot(time1,powera1,'g');
hold on;
plot(time1,powerb1,'b');
hold on;
plot(time1,powerc1,'r');
hold on;
plot(time1,tp1,'c')
xlabel('time(sec)'),ylabel('power(W)');
title('First Run-A,B,C Powers V. Total Power');

figure(2)
plot(time2,powera2,'g');
hold on;
plot(time2,powerb2,'b');
hold on;
plot(time2,powerc2,'r');
hold on;
plot(time2,tp2,'c')
xlabel('time(sec)'),ylabel('power(W)');
title('Second Run-A,B,C Powers V. Total Power');

figure(3)
plot(time3,powera3,'g');
hold on;
plot(time3,powerb3,'b');
hold on;
plot(time3,powerc3,'r');
hold on;
plot(time3,tp3,'c')
xlabel('time(sec)'),ylabel('power(W)');
title('Third Run-A,B,C Powers V. Total Power');

figure(4)
plot(time4,powera4,'g');
hold on;
plot(time4,powerb4,'b');
hold on;
plot(time4,powerc4,'r');
hold on;
plot(time4,tp4,'c');
xlabel('time(sec)'),ylabel('power(W)');
title('Fourth Run-A,B,C Powers V. Total Power');

figure(5)
plot(time1,va11,'g');
hold on;
plot(time2,va22,'b');
hold on;
plot(time3,va33,'r');
hold on;
plot(time4,va44,'c');
xlabel('time(sec)'),ylabel('voltage(V)');
title('Voltage A V. Time');

figure(6)
plot(time1,vb11,'g')
hold on;
plot(time2,vb22,'b')
hold on;
plot(time3,vb33,'r')
hold on;
plot(time4,vb44,'c')
xlabel('time(sec)'),ylabel('voltage(V)');
title('Voltage B V. Time');

figure(7)
plot(time1,vc11,'g')
hold on;
plot(time2,vc22,'b')
hold on;
plot(time3,vc33,'r')
hold on;
plot(time4,vc44,'c')
xlabel('time(sec)'),ylabel('voltage(V)');
title('Voltage C V. Time');

figure(8)
plot(time1,ic11,'g')
hold on;
plot(time1,ia11,'b')
hold on;
plot(time1,ib11,'r')
xlabel('time(sec)'),ylabel('current(A)');
title('Currents A,B,C V. Time (Run 1)');

figure(9)
plot(time2,ic22,'g')
hold on;
plot(time2,ia22,'b')
hold on;
plot(time2,ib22,'r')
xlabel('time(sec)'),ylabel('current(A)');
title('Currents A,B,C V. Time (Run 2)');

figure(10)
plot(time3,ic33,'g')
hold on;
plot(time3,ia33,'b')
hold on;
plot(time3,ib33,'r')
xlabel('time(sec)'),ylabel('current(A)');
title('Currents A,B,C V. Time (Run 3)');

figure(11)
plot(time4,ic44,'g')
hold on;
plot(time4,ia44,'b')
hold on;
plot(time4,ib44,'r')
xlabel('time(sec)'),ylabel('current(A)');
title('Currents A,B,C V. Time (Run 4)');