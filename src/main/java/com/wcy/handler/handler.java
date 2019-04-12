package com.wcy.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @author WCY
 * @create2018-12-30-11:58
 */
@Controller
public class handler {
    @RequestMapping("/test")
    public String test(Map<String,Object> map){
  List<student> list=new List<student>() {
      public int size() {
          return 0;
      }

      public boolean isEmpty() {
          return false;
      }

      public boolean contains(Object o) {
          return false;
      }

      public Iterator<student> iterator() {
          return null;
      }

      public Object[] toArray() {
          return new Object[0];
      }

      public <T> T[] toArray(T[] a) {
          return null;
      }

      public boolean add(student student) {
          return false;
      }

      public boolean remove(Object o) {
          return false;
      }

      public boolean containsAll(Collection<?> c) {
          return false;
      }

      public boolean addAll(Collection<? extends student> c) {
          return false;
      }

      public boolean addAll(int index, Collection<? extends student> c) {
          return false;
      }

      public boolean removeAll(Collection<?> c) {
          return false;
      }

      public boolean retainAll(Collection<?> c) {
          return false;
      }

      public void clear() {

      }

      public student get(int index) {
          return null;
      }

      public student set(int index, student element) {
          return null;
      }

      public void add(int index, student element) {

      }

      public student remove(int index) {
          return null;
      }

      public int indexOf(Object o) {
          return 0;
      }

      public int lastIndexOf(Object o) {
          return 0;
      }

      public ListIterator<student> listIterator() {
          return null;
      }

      public ListIterator<student> listIterator(int index) {
          return null;
      }

      public List<student> subList(int fromIndex, int toIndex) {
          return null;
      }
  }
        map.put("list",list);


        return "findall";



    }
}
